package inventario;

import bd.Conexion;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Oficinas extends javax.swing.JFrame {
    Integer indice = 0;
    Integer idoficina = 0;
    Integer idempleado = 0;
    Object datos[]=new Object[3]; 
    DefaultTableModel defaultTableModel = new DefaultTableModel(null, getColumnas());;
    
    
    public Oficinas() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        dialogoNomina.setLocation(450, 100);
        setResizable(false);
//        setTitle("Oficinas");
        dialogoNomina.setSize(500, 500);
        llenarOficinas();
        eventoTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoNomina = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNomina = new javax.swing.JTable();
        botonGenerarPDF = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        comboOficinas = new javax.swing.JComboBox();
        btnAtras = new javax.swing.JButton();
        btnAcceder = new javax.swing.JButton();

        dialogoNomina.setTitle("Nomina por oficina");
        dialogoNomina.setModal(true);
        dialogoNomina.setResizable(false);

        tablaNomina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaNomina);

        botonGenerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/documento.png"))); // NOI18N
        botonGenerarPDF.setText("Generar PDF");
        botonGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogoNominaLayout = new javax.swing.GroupLayout(dialogoNomina.getContentPane());
        dialogoNomina.getContentPane().setLayout(dialogoNominaLayout);
        dialogoNominaLayout.setHorizontalGroup(
            dialogoNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(dialogoNominaLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(botonGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogoNominaLayout.setVerticalGroup(
            dialogoNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoNominaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(botonGenerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleccion de oficina");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bienvenido. Seleccione la oficina"));

        comboOficinas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione una oficina---" }));
        comboOficinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOficinasActionPerformed(evt);
            }
        });

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/Arrow-Back-4-icon.png"))); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/Key-icon2.png"))); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboOficinas, 0, 348, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAcceder)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboOficinas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        if (comboOficinas.getSelectedIndex() != -1) {
            llenarNominaPorOficina();
            dialogoNomina.setVisible(true);
        }
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.setVisible(false);
        Administracion administracion = new Administracion();
        administracion.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void comboOficinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOficinasActionPerformed
        getIdOficina();
    }//GEN-LAST:event_comboOficinasActionPerformed

    private void botonGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarPDFActionPerformed
        try {
            File file = new File("reporte.jasper");
            Map<String, Object> mapa = new HashMap<>();
            mapa.put("oficina", idoficina);
            mapa.put("empleado", idempleado);
            JasperReport reporte = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, mapa, Conexion.Conectarse());
            JasperViewer visor = new JasperViewer(jasperPrint, false);
            visor.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    botonGenerarPDF.setEnabled(true);
                }
            });
            visor.setVisible(true);
            botonGenerarPDF.setEnabled(false);
        } catch (HeadlessException | JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido una excepcion creando el reporte","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_botonGenerarPDFActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Oficinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oficinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oficinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oficinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oficinas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGenerarPDF;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnAtras;
    private javax.swing.JComboBox comboOficinas;
    private javax.swing.JDialog dialogoNomina;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaNomina;
    // End of variables declaration//GEN-END:variables

    private void llenarOficinas() {
        List<String> listaOficina = new ArrayList<>();
        try {
            Statement stmt = Conexion.Conectarse().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM oficinas");
            while (rs.next()) {
                listaOficina.add(rs.getString("nombre"));
            }
            for (String string : listaOficina) {
                comboOficinas.addItem(string);
            }
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error consultando las oficinas","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    private void llenarNominaPorOficina() {
//        Object datos[]=new Object[3]; 
        
        try {
            
            tablaNomina.setModel(defaultTableModel);
            Statement stmt = Conexion.Conectarse().createStatement();
            Statement stmt2 = Conexion.Conectarse().createStatement();
            String consulta = "SELECT e.nombre,e.apellidos,e.cargo from empleado e WHERE e.oficina = "+idoficina+"";
            String consultaTitulo = "SELECT o.nombre from oficinas o WHERE o.id = "+idoficina+"";
            ResultSet rs = stmt.executeQuery(consulta);
            ResultSet rs2 = stmt2.executeQuery(consultaTitulo);
            String titulo = "";
            while (rs2.next()) {
                titulo = rs2.getString("nombre");
            }
            while (rs.next()) {
                for (int i = 0; i < 3; i++) {
                    datos[i] = rs.getObject(i + 1);
                }
                defaultTableModel.addRow(datos);
            }
            rs.close();
            rs2.close();
            
            dialogoNomina.setTitle("Empleados de la oficina de "+titulo);
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error consultando los empleados","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private String[] getColumnas(){
        String columna[]=new String[]{"Empleado","Apellido","Cargo"};
        return columna;
    }

    private void getIdOficina() {
        try {
            Statement stmt = Conexion.Conectarse().createStatement();
            ResultSet resulset = stmt.executeQuery("SELECT id FROM oficinas WHERE nombre = '"+comboOficinas.getItemAt(comboOficinas.getSelectedIndex())+"'");
            while (resulset.next()) {
                idoficina = resulset.getInt("id");
            }
            System.out.println("ID Oficina--> "+idoficina);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error cargando el id de la oficina","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private void getIdEmpleado() {
        try {
            String nombreEmpleado = (String) tablaNomina.getValueAt(tablaNomina.getSelectedRow(), 0);
            Statement stmt = Conexion.Conectarse().createStatement();
            ResultSet resulset = stmt.executeQuery("SELECT id FROM empleado WHERE nombre = '"+nombreEmpleado+"'");
            while (resulset.next()) {
                idempleado = resulset.getInt("id");
            }
            System.out.println("ID Empleado--> "+idempleado);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error cargando el id del empleado","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    private void eventoTabla() {
        tablaNomina.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                getIdEmpleado();
            }
        });
    }
}
