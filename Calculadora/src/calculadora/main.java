/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Manuel Manzano
 */
public class main extends javax.swing.JFrame {
    
    String pantalla="";
    float num1=0, num2=0;
    double resultado=0;
    char signo;

    /**
     * Creates new form main
     */
    public main() {
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

        jButtonnum4 = new javax.swing.JButton();
        jButtonnum7 = new javax.swing.JButton();
        jButtonnum1 = new javax.swing.JButton();
        jButtonnum2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonnum8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButtonnum9 = new javax.swing.JButton();
        jButtonnum3 = new javax.swing.JButton();
        jButton1restar = new javax.swing.JButton();
        jButtonmultiplicar = new javax.swing.JButton();
        jButtondividir = new javax.swing.JButton();
        jButtonsumar = new javax.swing.JButton();
        jButtonnum0 = new javax.swing.JButton();
        jButtonigual = new javax.swing.JButton();
        jButtoncoma = new javax.swing.JButton();
        jTextFieldpantalla = new javax.swing.JTextField();
        jButtonlimpiar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtoncambiosigno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonnum4.setText("4");
        jButtonnum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum4ActionPerformed(evt);
            }
        });

        jButtonnum7.setText("7");
        jButtonnum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum7ActionPerformed(evt);
            }
        });

        jButtonnum1.setText("1");
        jButtonnum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum1ActionPerformed(evt);
            }
        });

        jButtonnum2.setText("2");
        jButtonnum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum2ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButtonnum8.setText("8");
        jButtonnum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum8ActionPerformed(evt);
            }
        });

        jButton7.setText("6");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButtonnum9.setText("9");
        jButtonnum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum9ActionPerformed(evt);
            }
        });

        jButtonnum3.setText("3");
        jButtonnum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnum3ActionPerformed(evt);
            }
        });

        jButton1restar.setText("-");
        jButton1restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1restarActionPerformed(evt);
            }
        });

        jButtonmultiplicar.setText("x");
        jButtonmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmultiplicarActionPerformed(evt);
            }
        });

        jButtondividir.setText("/");
        jButtondividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondividirActionPerformed(evt);
            }
        });

        jButtonsumar.setText("+");
        jButtonsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsumarActionPerformed(evt);
            }
        });

        jButtonnum0.setText("0");

        jButtonigual.setText("=");
        jButtonigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonigualActionPerformed(evt);
            }
        });

        jButtoncoma.setText(".");
        jButtoncoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncomaActionPerformed(evt);
            }
        });

        jTextFieldpantalla.setEditable(false);
        jTextFieldpantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButtonlimpiar.setText("CE");
        jButtonlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlimpiarActionPerformed(evt);
            }
        });

        jButton2.setText("C");

        jButtoncambiosigno.setText("+/-");
        jButtoncambiosigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncambiosignoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldpantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonnum8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonnum9, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jButtonnum3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtoncambiosigno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonsumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonnum0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtoncoma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1restar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtondividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonmultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButtonigual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldpantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtoncambiosigno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonnum7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonnum8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonnum9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtondividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonsumar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonmultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1restar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonnum0, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtoncoma, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonigual, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonnum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum7ActionPerformed
        pantalla= jTextFieldpantalla.getText()+ '7';
       jTextFieldpantalla.setText(pantalla);
    }//GEN-LAST:event_jButtonnum7ActionPerformed

    private void jButtonnum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum1ActionPerformed
       pantalla = jTextFieldpantalla.getText()+ '1';
       jTextFieldpantalla.setText(pantalla);
    }//GEN-LAST:event_jButtonnum1ActionPerformed

    private void jButtonnum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum2ActionPerformed
       pantalla= jTextFieldpantalla.getText()+ '2';
       jTextFieldpantalla.setText(pantalla);
    }//GEN-LAST:event_jButtonnum2ActionPerformed

    private void jButtonnum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum3ActionPerformed
        pantalla= jTextFieldpantalla.getText()+ '3';
       jTextFieldpantalla.setText(pantalla);
    }//GEN-LAST:event_jButtonnum3ActionPerformed

    private void jButtonnum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum4ActionPerformed
        pantalla= jTextFieldpantalla.getText()+ '4';
       jTextFieldpantalla.setText(pantalla);
    }//GEN-LAST:event_jButtonnum4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       pantalla= jTextFieldpantalla.getText()+ '5';
       jTextFieldpantalla.setText(pantalla);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        pantalla= jTextFieldpantalla.getText()+ '6';
       jTextFieldpantalla.setText(pantalla);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButtonnum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum8ActionPerformed
       pantalla= jTextFieldpantalla.getText()+ '8';
       jTextFieldpantalla.setText(pantalla);
    }//GEN-LAST:event_jButtonnum8ActionPerformed

    private void jButtonnum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnum9ActionPerformed
        pantalla= jTextFieldpantalla.getText()+ '9';
       jTextFieldpantalla.setText(pantalla);
    }//GEN-LAST:event_jButtonnum9ActionPerformed

    private void jButtoncomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncomaActionPerformed
        pantalla= jTextFieldpantalla.getText()+ '.';
       jTextFieldpantalla.setText(pantalla);
    }//GEN-LAST:event_jButtoncomaActionPerformed

    private void jButtonsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsumarActionPerformed
        signo='+';
        num1=Float.valueOf(pantalla);
        pantalla="";
        jTextFieldpantalla.setText(pantalla);  
    }//GEN-LAST:event_jButtonsumarActionPerformed

    private void jButton1restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1restarActionPerformed
       signo='-';
       num1=Float.valueOf(pantalla);
       pantalla="";
       jTextFieldpantalla.setText(pantalla);
       num1=num1-Long.valueOf(pantalla);
    }//GEN-LAST:event_jButton1restarActionPerformed

    private void jButtonmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmultiplicarActionPerformed
        signo='x';
        num1=Float.valueOf(pantalla);
        pantalla="";
        jTextFieldpantalla.setText(pantalla);
        num1=num1*Long.valueOf(pantalla);
    }//GEN-LAST:event_jButtonmultiplicarActionPerformed

    private void jButtondividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondividirActionPerformed
        signo='/';
        num1=Float.valueOf(pantalla);
        pantalla="";
        jTextFieldpantalla.setText(pantalla);
        num1=num1/Long.valueOf(pantalla);
    }//GEN-LAST:event_jButtondividirActionPerformed

    private void jButtonigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonigualActionPerformed
        num2 = Float.valueOf(jTextFieldpantalla.getText());
        pantalla="";
        jTextFieldpantalla.setText(pantalla); 
        switch(signo) {
	case '+':
		resultado = num1+num2;
		break;
	case '-':
		resultado = num1-num2;
		break;
	case 'x':
		resultado = num1*num2;
		break;
	case '/':
		resultado = num1/num2;
		break;
        }
        jTextFieldpantalla.setText(Double.toString(resultado));
    }//GEN-LAST:event_jButtonigualActionPerformed

    private void jButtonlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlimpiarActionPerformed
        num1=0;
        num2=0;
        resultado=0;
        pantalla="";
        signo=' ';
        jTextFieldpantalla.setText(pantalla);
    }//GEN-LAST:event_jButtonlimpiarActionPerformed

    private void jButtoncambiosignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncambiosignoActionPerformed
        jTextFieldpantalla.setText(
                String.valueOf((-1)*Double.valueOf(jTextFieldpantalla.getText())));
    }//GEN-LAST:event_jButtoncambiosignoActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1restar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtoncambiosigno;
    private javax.swing.JButton jButtoncoma;
    private javax.swing.JButton jButtondividir;
    private javax.swing.JButton jButtonigual;
    private javax.swing.JButton jButtonlimpiar;
    private javax.swing.JButton jButtonmultiplicar;
    private javax.swing.JButton jButtonnum0;
    private javax.swing.JButton jButtonnum1;
    private javax.swing.JButton jButtonnum2;
    private javax.swing.JButton jButtonnum3;
    private javax.swing.JButton jButtonnum4;
    private javax.swing.JButton jButtonnum7;
    private javax.swing.JButton jButtonnum8;
    private javax.swing.JButton jButtonnum9;
    private javax.swing.JButton jButtonsumar;
    private javax.swing.JTextField jTextFieldpantalla;
    // End of variables declaration//GEN-END:variables
}