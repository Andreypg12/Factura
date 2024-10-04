/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Factura;

import Persistencia.PersistenciaProductos;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class jDlgMantenimientoProductos extends javax.swing.JDialog {

    /**
     * Creates new form jDlgMantenimientoProductos
     */
    public jDlgMantenimientoProductos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    private Producto producto;
    private EnumMantenimiento tipoMantenimiento;

    public jDlgMantenimientoProductos(Producto producto, EnumMantenimiento tipoMantenimiento) {
        initComponents();
        llenarCombo();
        
        switch (tipoMantenimiento) {
            case MODIFICAR ->{
                jTxtNombre.setText(producto.getNombre());
                jTxtPrecio.setText(String.valueOf(producto.getPrecioBasico()));
                jComboBox1.setSelectedItem(producto.getTipo());
                this.producto = producto;
                this.tipoMantenimiento = tipoMantenimiento;
            }
            case AGREGAR ->{
                this.tipoMantenimiento = tipoMantenimiento;
            }
            case CONSULTAR ->{
                jTxtNombre.setText(producto.getNombre());
                jTxtNombre.setEnabled(false);
                jTxtPrecio.setText(String.valueOf(producto.getPrecioBasico()));
                jTxtPrecio.setEnabled(false);
                jComboBox1.setSelectedItem(producto.getTipo());
                jComboBox1.setEnabled(false);
                this.tipoMantenimiento = tipoMantenimiento;
            }
                
        }
    }
    
    public void llenarCombo(){
        jComboBox1.setModel(new DefaultComboBoxModel(TipoProducto.values()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jBtnAceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre");

        jTxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Precio");

        jLabel3.setText("Tipo del producto");

        jBtnAceptar.setText("Aceptar");
        jBtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptarActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 197, Short.MAX_VALUE)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jBtnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAceptar)
                    .addComponent(jButton1))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNombreActionPerformed

    private void jBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptarActionPerformed
        // TODO add your handling code here:
        switch (tipoMantenimiento) {
            case MODIFICAR ->{
                    producto.setNombre(jTxtNombre.getText());
                    producto.setPrecioBasico(Double.parseDouble(jTxtPrecio.getText()));
                    producto.setTipo((TipoProducto)jComboBox1.getSelectedItem());
                    dispose();
            }
            case AGREGAR ->{
                if (PersistenciaProductos.existe(jTxtNombre.getText())) {
                    JOptionPane.showMessageDialog(null, "El producto ya existe");
                }else{
                    Producto nuevoProducto = new Producto(jTxtNombre.getText(),
                            Double.parseDouble(jTxtPrecio.getText()),
                            (TipoProducto)jComboBox1.getSelectedItem());
                    PersistenciaProductos.agregarProductos(nuevoProducto);
                    dispose();
                }
            }
            case CONSULTAR ->{
                dispose();
            }
        }
        
        
    }//GEN-LAST:event_jBtnAceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<TipoProducto> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtPrecio;
    // End of variables declaration//GEN-END:variables
}
