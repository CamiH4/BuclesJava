/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciascontrol;

/**
 *
 * @author José Alejandro Durán
 */
public class Arreglo1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Arreglos
     */
    public Arreglo1() {
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

        pArreglo = new javax.swing.JPanel();
        lTam = new javax.swing.JLabel();
        tfTam = new javax.swing.JTextField();
        bSetTam = new javax.swing.JButton();
        lMultiplos = new javax.swing.JLabel();
        lElemento = new javax.swing.JLabel();
        tfElemento = new javax.swing.JTextField();
        bAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsNumeros = new javax.swing.JList<>();
        tfMultiplo = new javax.swing.JTextField();
        pInfoArreglo = new javax.swing.JPanel();
        bMostrarMayorMenor = new javax.swing.JButton();
        lMayor = new javax.swing.JLabel();
        tfMayor = new javax.swing.JTextField();
        lMenor = new javax.swing.JLabel();
        tfMenor = new javax.swing.JTextField();
        bMostrarPromedio = new javax.swing.JButton();
        tfPromedio = new javax.swing.JTextField();
        bMostrarMayores = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lsMayores = new javax.swing.JList<>();

        setClosable(true);
        setResizable(true);
        setTitle("Arreglo Unidemensional | Elementos enteros");

        pArreglo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arreglo de tipo entero", 2, 0));

        lTam.setText("Tamaño:");

        tfTam.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfTam.setText("0");

        bSetTam.setText("Establecer Tamaño");

        lMultiplos.setText("Almacenar sólo números múltiplos de:");

        lElemento.setText("Elemento:");

        bAgregar.setText("Agregar");

        jScrollPane1.setViewportView(lsNumeros);

        javax.swing.GroupLayout pArregloLayout = new javax.swing.GroupLayout(pArreglo);
        pArreglo.setLayout(pArregloLayout);
        pArregloLayout.setHorizontalGroup(
            pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pArregloLayout.createSequentialGroup()
                .addGroup(pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pArregloLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pArregloLayout.createSequentialGroup()
                                .addComponent(lElemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pArregloLayout.createSequentialGroup()
                                        .addComponent(tfElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bAgregar))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pArregloLayout.createSequentialGroup()
                                .addComponent(lTam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTam, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bSetTam, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))))
                    .addGroup(pArregloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lMultiplos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMultiplo)))
                .addContainerGap())
        );
        pArregloLayout.setVerticalGroup(
            pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pArregloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSetTam)
                    .addComponent(lTam))
                .addGap(18, 18, 18)
                .addGroup(pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMultiplos)
                    .addComponent(tfMultiplo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lElemento)
                    .addComponent(tfElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pInfoArreglo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información del arreglo", 2, 0));

        bMostrarMayorMenor.setText("Mostrar el mayor y menor de los elementos");

        lMayor.setText("Mayor:");

        tfMayor.setEditable(false);

        lMenor.setText("Menor:");

        tfMenor.setEditable(false);

        bMostrarPromedio.setText("Mostrar Promedio");

        bMostrarMayores.setText("Mostrar números mayores al promedio");

        jScrollPane2.setViewportView(lsMayores);

        javax.swing.GroupLayout pInfoArregloLayout = new javax.swing.GroupLayout(pInfoArreglo);
        pInfoArreglo.setLayout(pInfoArregloLayout);
        pInfoArregloLayout.setHorizontalGroup(
            pInfoArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bMostrarMayorMenor)
            .addGroup(pInfoArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(pInfoArregloLayout.createSequentialGroup()
                    .addComponent(bMostrarPromedio)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(tfPromedio))
                .addGroup(pInfoArregloLayout.createSequentialGroup()
                    .addComponent(lMayor)
                    .addGap(18, 18, 18)
                    .addComponent(tfMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lMenor)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tfMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pInfoArregloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bMostrarMayores))
            .addGroup(pInfoArregloLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pInfoArregloLayout.setVerticalGroup(
            pInfoArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoArregloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bMostrarMayorMenor)
                .addGap(18, 18, 18)
                .addGroup(pInfoArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMayor)
                    .addComponent(tfMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lMenor)
                    .addComponent(tfMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pInfoArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMostrarPromedio)
                    .addComponent(tfPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bMostrarMayores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pInfoArreglo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pArreglo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pInfoArreglo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Arreglo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arreglo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arreglo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arreglo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arreglo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bMostrarMayorMenor;
    private javax.swing.JButton bMostrarMayores;
    private javax.swing.JButton bMostrarPromedio;
    private javax.swing.JButton bSetTam;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lElemento;
    private javax.swing.JLabel lMayor;
    private javax.swing.JLabel lMenor;
    private javax.swing.JLabel lMultiplos;
    private javax.swing.JLabel lTam;
    private javax.swing.JList<String> lsMayores;
    private javax.swing.JList<String> lsNumeros;
    private javax.swing.JPanel pArreglo;
    private javax.swing.JPanel pInfoArreglo;
    private javax.swing.JTextField tfElemento;
    private javax.swing.JTextField tfMayor;
    private javax.swing.JTextField tfMenor;
    private javax.swing.JTextField tfMultiplo;
    private javax.swing.JTextField tfPromedio;
    private javax.swing.JTextField tfTam;
    // End of variables declaration//GEN-END:variables
}