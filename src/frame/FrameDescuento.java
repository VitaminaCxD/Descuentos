package frame;

import descuento.Descuento;
import javax.swing.JOptionPane;

/**
 *
 * @author VitaminaC
 * @version 1.0
 * @since 08/11/2021
 */
public class FrameDescuento extends javax.swing.JFrame {

    public FrameDescuento() {
        initComponents();
        jComboBoxItems();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Interacción = new javax.swing.JPanel();
        jtf_cantidad = new javax.swing.JTextField();
        jcb_porcentaje = new javax.swing.JComboBox<>();
        jb_obtenerDescuento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Descuentos [v1.0]");
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        Interacción.setOpaque(false);

        jtf_cantidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jcb_porcentaje.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcb_porcentaje.setForeground(new java.awt.Color(0, 0, 0));

        jb_obtenerDescuento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jb_obtenerDescuento.setForeground(new java.awt.Color(0, 0, 0));
        jb_obtenerDescuento.setText("DESCUENTO");
        jb_obtenerDescuento.setFocusable(false);
        jb_obtenerDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Descuento(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DIGITE UN VALOR");

        javax.swing.GroupLayout InteracciónLayout = new javax.swing.GroupLayout(Interacción);
        Interacción.setLayout(InteracciónLayout);
        InteracciónLayout.setHorizontalGroup(
            InteracciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InteracciónLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InteracciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InteracciónLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(InteracciónLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jb_obtenerDescuento)
                        .addGap(18, 18, 18)
                        .addComponent(jcb_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InteracciónLayout.setVerticalGroup(
            InteracciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InteracciónLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(InteracciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_obtenerDescuento))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(Interacción, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Interacción, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        getContentPane().add(Fondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método que generará los items contenidos por el JCombBox
    private void jComboBoxItems() {
        for (int i = 1; i <= 100; i++) {
            jcb_porcentaje.addItem(String.valueOf(i + "%"));
        }
    }

    //Método para generar el descuento
    private void Descuento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Descuento
        try {
            if (!jtf_cantidad.getText().trim().equals("")) {
                Descuento descuento = new Descuento(Double.parseDouble(jtf_cantidad.getText()), jcb_porcentaje.getSelectedIndex());

                descuento.start();
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: Necesita colocar una cantidad  para generar un descuento.", "Descuentos [v1.0]",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERROR: Solo se pueden colocar numeros.", "Descuentos [v1.0]",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Descuento


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Interacción;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jb_obtenerDescuento;
    private javax.swing.JComboBox<String> jcb_porcentaje;
    private javax.swing.JTextField jtf_cantidad;
    // End of variables declaration//GEN-END:variables
}
