package bd;

import java.sql.*;

public class Conexion {

    public static void main(String[] args) {
        String driver = "org.postgresql.Driver";
        String connectString = "jdbc:postgresql://localhost:5432/inventario";
        String user = "postgres";
        String password = "r00t";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connectString, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuario");

            while (rs.next()) {
                System.out.println("CEDULA " + rs.getString("usuario"));
            }

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static Connection Conectarse(){
        String driver = "org.postgresql.Driver";
        String connectString = "jdbc:postgresql://localhost:5432/inventario";
        String user = "postgres";
        String password = "r00t";
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connectString, user, password);
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        
    }
    
    public static Connection Actualizar(){
        String driver = "org.postgresql.Driver";
        String connectString = "jdbc:postgresql://localhost:5432/inventario";
        String user = "postgres";
        String password = "root";        
        return null;
    }
}

