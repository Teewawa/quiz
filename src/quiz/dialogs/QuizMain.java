/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * QuizMain.java
 *
 * Created on 13/04/2011, 20:09:01
 */
package quiz.dialogs;

import quiz.gui.Dialogs;

/**
 *
 * @author higor
 */
public class QuizMain extends javax.swing.JFrame {

    private QuizMatch matchDialog;
    private QuizServer serverDialog;

    /** Creates new form QuizMain */
    public QuizMain() {
        super();
        initComponents();

        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(startButton);
        
        matchDialog = new QuizMatch(this);
        serverDialog = new QuizServer(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nickText = new javax.swing.JTextField();
        serverCheck = new javax.swing.JCheckBox();
        serverText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        startButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz");
        setResizable(false);

        quitButton.setText("Sair");
        quitButton.setName("quitButton"); // NOI18N
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz/resources/quiz.png"))); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Seu nome ou apelido:");
        jLabel2.setName("jLabel2"); // NOI18N

        nickText.setText("usuario");
        nickText.setName("nickText"); // NOI18N

        serverCheck.setText("Eu gostaria de ser o servidor.");
        serverCheck.setName("serverCheck"); // NOI18N
        serverCheck.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                serverCheckStateChanged(evt);
            }
        });

        serverText.setText("localhost");
        serverText.setName("serverText"); // NOI18N

        jLabel3.setText("Endereço do servidor:");
        jLabel3.setName("jLabel3"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N

        startButton.setText("Iniciar");
        startButton.setName("startButton"); // NOI18N
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serverCheck)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(nickText, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(serverText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(startButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nickText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serverText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serverCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitButton)
                    .addComponent(startButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void serverCheckStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_serverCheckStateChanged
        if (serverCheck.isSelected()) {
            serverText.setEnabled(false);
            serverText.setText("0.0.0.0");
        } else {
            serverText.setEnabled(true);
        }
    }//GEN-LAST:event_serverCheckStateChanged

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        if (serverCheck.isSelected()) {
            serverDialog.showDialog();
        } else {
            if (nickText.getText().isEmpty()) {
                Dialogs.error(this, "Você precisa informar um apelido para se conectar a um servidor.");
                nickText.requestFocusInWindow();
                return;
            }

            startButton.setSelected(false);
            matchDialog.connect(nickText.getText(), serverText.getText());
        }
    }//GEN-LAST:event_startButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nickText;
    private javax.swing.JButton quitButton;
    private javax.swing.JCheckBox serverCheck;
    private javax.swing.JTextField serverText;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}