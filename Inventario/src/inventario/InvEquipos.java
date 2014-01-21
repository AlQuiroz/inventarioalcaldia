package inventario;

import bd.Conexion;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InvEquipos extends javax.swing.JFrame {
    Integer idoficina = new Integer(0);
    Integer idempleado = new Integer(0);
    public InvEquipos() {
        initComponents();
//        getIdOficina();
        llenarOficinas();
        llenarComboEmpleados();
        llenarEmpleados();
        this.setLocationRelativeTo(null);
        dialogoOperador.setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Actualizar Información");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        dialogoOperador = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboOficinas = new javax.swing.JComboBox();
        labelIdOficina = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSysOp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtProcesador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRam = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDisco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMonitor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMouse = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTeclado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtImpresora = new javax.swing.JTextField();
        botonGuardarEquipo = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        comboEmpleado = new javax.swing.JComboBox();
        labelIdEmpleado = new javax.swing.JLabel();
        btnNempleado = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        dialogoOperador.setMinimumSize(new java.awt.Dimension(409, 482));
        dialogoOperador.setModal(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Nuevo Empleado");

        jLabel1.setText("Oficina:");

        comboOficinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOficinasActionPerformed(evt);
            }
        });

        jLabel2.setText("Cargo:");

        jLabel4.setText("Nombres:");

        jLabel14.setText("Apellidos:");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/diskette.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nombre", "Oficina"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEmpleado);
        if (tablaEmpleado.getColumnModel().getColumnCount() > 0) {
            tablaEmpleado.getColumnModel().getColumn(0).setResizable(false);
            tablaEmpleado.getColumnModel().getColumn(1).setResizable(false);
        }

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/Letter-X-icon.png"))); // NOI18N
        btnEliminar.setText("Eliminar Empleado");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCargo)
                                .addComponent(txtNombres)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comboOficinas, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(labelIdOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelIdOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboOficinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14))
                        .addGap(5, 5, 5)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 57, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout dialogoOperadorLayout = new javax.swing.GroupLayout(dialogoOperador.getContentPane());
        dialogoOperador.getContentPane().setLayout(dialogoOperadorLayout);
        dialogoOperadorLayout.setHorizontalGroup(
            dialogoOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoOperadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogoOperadorLayout.setVerticalGroup(
            dialogoOperadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoOperadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción del Equipo"));

        jLabel5.setText("SISTEMA OPERATIVO:");

        jLabel6.setText("PROCESADOR:");

        jLabel7.setText("MEMORIA RAM:");

        jLabel8.setText("DISCO DURO:");

        jLabel9.setText("MONITOR:");

        jLabel10.setText("MOUSE:");

        jLabel11.setText("TECLADO:");

        jLabel12.setText("IMPRESORA:");

        botonGuardarEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/diskette.png"))); // NOI18N
        botonGuardarEquipo.setText("Guardar");
        botonGuardarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarEquipoActionPerformed(evt);
            }
        });

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/Arrow-Back-4-icon.png"))); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel13.setText("EMPLEADO");

        comboEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un empleado" }));
        comboEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmpleadoActionPerformed(evt);
            }
        });

        btnNempleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Imagenes/plus.png"))); // NOI18N
        btnNempleado.setText("Nuevo empleado");
        btnNempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNempleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtImpresora, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(txtTeclado)
                            .addComponent(txtMouse)
                            .addComponent(txtMonitor)
                            .addComponent(txtDisco)
                            .addComponent(txtRam)
                            .addComponent(txtProcesador)
                            .addComponent(txtSysOp)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                        .addComponent(comboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNempleado)
                        .addGap(18, 18, 18)
                        .addComponent(botonGuardarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labelIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(comboEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSysOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtProcesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtImpresora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonGuardarEquipo)
                        .addComponent(btnNempleado)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.setVisible(false);
        Administracion administracion = new Administracion();
        administracion.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void botonGuardarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarEquipoActionPerformed
        try {
            Statement stmt = Conexion.Conectarse().createStatement();
            String insertar = "INSERT INTO descequipo (sistemaoperativo, procesador, memoriaram, discoduro, monitor, mouse, teclado, impresora, empleado) "
            + "values('"+txtSysOp.getText()+"','"+txtProcesador.getText()+"','"+txtRam.getText()+"','"+txtDisco.getText()+"','"+txtMouse.getText()+"',"
            + "'"+txtMonitor.getText()+"','"+txtTeclado.getText()+"','"+txtImpresora.getText()+"',"+idempleado+")";
            System.out.println("INSERTAR--> "+insertar);
            int resultado = stmt.executeUpdate(insertar);//descomentar
            if (resultado > 0) {
                JOptionPane.showMessageDialog(rootPane, "Se ha agregado el empleado con exito");
                txtSysOp.setText("");
                txtProcesador.setText("");
                txtRam.setText("");
                txtDisco.setText("");
                txtMonitor.setText("");
                txtMouse.setText("");
                txtTeclado.setText("");
                txtImpresora.setText("");
                comboEmpleado.setSelectedIndex(0);
                llenarEmpleados();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error insertando el empleado","Error",JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error insertando el empleado","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_botonGuardarEquipoActionPerformed

    private void comboEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmpleadoActionPerformed
        dialogoOperador.setModal(true);
        try {
            Statement stmt = Conexion.Conectarse().createStatement();
            ResultSet resulset = stmt.executeQuery("SELECT id FROM empleado WHERE nombre = '"+comboEmpleado.getItemAt(comboEmpleado.getSelectedIndex())+"'");
            while (resulset.next()) {
                idempleado = resulset.getInt("id");
            }
            System.out.println("ID Empleado--> "+idempleado);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error cargando el id del empleado","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_comboEmpleadoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            Statement stmt = Conexion.Conectarse().createStatement();
            String insertar = "INSERT INTO empleado (oficina, cargo, nombre, apellidos) values("+idoficina+",'"+txtCargo.getText()+"','"+txtNombres.getText()+"','"+txtApellidos.getText()+"')";
            System.out.println("INSERTAR--> "+insertar);
            int resultado = stmt.executeUpdate(insertar);
            if (resultado > 0) {
                JOptionPane.showMessageDialog(rootPane, "Se ha agregado el operador con exito");
                txtCargo.setText("");
                txtNombres.setText("");
                txtApellidos.setText("");
                comboOficinas.setSelectedIndex(0);
                llenarEmpleados();
                comboEmpleado.removeAllItems();
                comboEmpleado.setSelectedIndex(0);
                llenarComboEmpleados();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error insertando el operador","Error",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error insertando el operador","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void comboOficinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOficinasActionPerformed
        getIdOficina();
    }//GEN-LAST:event_comboOficinasActionPerformed

    private void btnNempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNempleadoActionPerformed
        dialogoOperador.setVisible(true);
        getIdOficina();
    }//GEN-LAST:event_btnNempleadoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tablaEmpleado.getSelectedRow() != -1) {
            String nombre_empleado = (String) tablaEmpleado.getValueAt(tablaEmpleado.getSelectedRow(), 0);
            int confirmar = JOptionPane.showConfirmDialog(rootPane, "¿Está usted seguro de elimiar el empleado "+nombre_empleado+"?");
            if (confirmar == JOptionPane.YES_OPTION) {
                try {
                    Statement stmt = Conexion.Conectarse().createStatement();
                    System.out.println("ID EMPLEADO "+idempleado);
                    ResultSet resultSet = stmt.executeQuery("select id from empleado where nombre ='"+nombre_empleado+"'");
                    while (resultSet.next()) {
                        idempleado = resultSet.getInt("id");
                    }
                    String eliminarEquipo = "DELETE FROM descequipo WHERE empleado ='"+idempleado+"'";
                    String eliminarEmpleado = "DELETE FROM empleado WHERE nombre ='"+nombre_empleado+"'";
                    int resultadoEquipo = stmt.executeUpdate(eliminarEquipo);
                    int resultadoEmpleado = stmt.executeUpdate(eliminarEmpleado);
                    llenarEmpleados();
                    if (resultadoEmpleado > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Se ha eliminado con éxito el empleado de la base de datos.");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un problema eliminando el empleado","Error",JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
                
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un empleado a eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InvEquipos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvEquipos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvEquipos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvEquipos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvEquipos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardarEquipo;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNempleado;
    private javax.swing.JComboBox comboEmpleado;
    private javax.swing.JComboBox comboOficinas;
    private javax.swing.JDialog dialogoOperador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelIdEmpleado;
    private javax.swing.JLabel labelIdOficina;
    private javax.swing.JTable tablaEmpleado;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtDisco;
    private javax.swing.JTextField txtImpresora;
    private javax.swing.JTextField txtMonitor;
    private javax.swing.JTextField txtMouse;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtProcesador;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtSysOp;
    private javax.swing.JTextField txtTeclado;
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

    private void llenarEmpleados() {
        Object datos[]=new Object[3]; 
        DefaultTableModel defaultTableModel;
        try {
            defaultTableModel = new DefaultTableModel(null, getColumnas());
            tablaEmpleado.setModel(defaultTableModel);
            Statement stmt = Conexion.Conectarse().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT e.nombre,e.cargo,o.nombre from empleado e, oficinas o WHERE e.oficina = o.id");
            while (rs.next()) {
                for (int i = 0; i < 3; i++) {
                    datos[i] = rs.getObject(i + 1);
                }
                defaultTableModel.addRow(datos);
            }
            
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error consultando los empleados","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    private String[] getColumnas(){
        String columna[]=new String[]{"Empleado","Cargo","Oficina"};
        return columna;
    }
    private void llenarComboEmpleados(){
        List<String> listaOficina = new ArrayList<>();
        try {
            Statement stmt = Conexion.Conectarse().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT e.nombre,e.cargo,o.nombre from empleado e, oficinas o WHERE e.id = o.id");
            while (rs.next()) {
                listaOficina.add(rs.getString("nombre"));//llena el combo de empleados
            }
            for (String string : listaOficina) {//llena el combo de empleados
                comboEmpleado.addItem(string);
            }//llena el combo de empleados
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un problema llenando los empleados","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private void getIdOficina(){
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
}
