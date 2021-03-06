
package com.unab.Vista;
import com.unab.DAO.Estudiantes;
import com.unab.DAO.NotaDAO;
import com.unab.DB.ConnectMySql;
import com.unab.Entidades.Estudiante;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;


public class FrmConsultaBD extends javax.swing.JFrame {

    /**
     * Creates new form FrmConsultaBD
     */
    public FrmConsultaBD() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTestCon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiante = new javax.swing.JTable();
        btnModelaje = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnJOIN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTestCon.setText("Test Connection");
        btnTestCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestConActionPerformed(evt);
            }
        });

        tblEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblEstudiante);

        btnModelaje.setText("Modelaje Tabla");
        btnModelaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelajeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnJOIN.setText("INNER JOIN");
        btnJOIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJOINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTestCon)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModelaje, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnJOIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82))))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnModelaje, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnJOIN, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(btnTestCon)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestConActionPerformed
        
        ConnectMySql clsCon = new ConnectMySql();
        
        clsCon.getConnection();
    }//GEN-LAST:event_btnTestConActionPerformed

    private void btnModelajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelajeActionPerformed
        
        String titulos[] = {"Nombre","Apellido"};       
        DefaultTableModel dtm = new DefaultTableModel(null,titulos);
        
        Estudiantes es = new Estudiantes();        
        /*ArrayList<Estudiante>*/var listarE = es.listar();        
//        Iterator it = listarE.iterator();
        String fila[] = new String[3];
        
//        while (it.hasNext()) {
        for (var iteracion : listarE) {
//            Estudiante estLoop = (Estudiante)it.next();
            fila[0] = iteracion.getNombre();
            fila[1] = iteracion.getApellido();
            dtm.addRow(fila); 
        }
        
        
        tblEstudiante.setModel(dtm);
    }//GEN-LAST:event_btnModelajeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        Estudiante es = new Estudiante();
        Estudiantes esdao = new Estudiantes();
        
        es.setNombre(txtNombre.getText());
        es.setApellido(txtApellido.getText());
        esdao.AddStudent(es);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnJOINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJOINActionPerformed
        
             String title[] = {"Nombre","Apellido","Materia","Nota"};
        DefaultTableModel dtm = new DefaultTableModel(null,title);
        
        NotaDAO nDAO = new NotaDAO();
        var listN = nDAO.ListaEstudiantes();
        String Fila[] = new String[5];
        
        for(var iteracion:listN){
            Fila[0] = iteracion.getNombre();
            Fila[1] = iteracion.getApellido();
            Fila[2] = iteracion.getNombremateria();
            Fila[3] = iteracion.getNota();
            dtm.addRow(Fila);
         
        }
        
        tblEstudiante.setModel(dtm);
    }//GEN-LAST:event_btnJOINActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConsultaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultaBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnJOIN;
    private javax.swing.JButton btnModelaje;
    private javax.swing.JButton btnTestCon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEstudiante;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
