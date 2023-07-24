package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Pomodoro extends javax.swing.JFrame {

    private int tempoRestante;
    private int tempoInicial = 1;
    private Timer timer;
    
    public Pomodoro() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start = new javax.swing.JButton();
        tempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        start.setFont(new java.awt.Font("XOUMEG S57", 0, 60)); // NOI18N
        start.setText("START");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        tempo.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        tempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tempo.setText("25:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(tempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        tempoRestante = 10; // TEMPO INICIAL CONVERTIDO SEGUNDOS;
        this.timer = new Timer(1000, (ActionEvent e) -> {
            atualizaTempo();
        });
        timer.start();
        start.setEnabled(false);
    }//GEN-LAST:event_startActionPerformed

    private void atualizaTempo(){
        int minutos = tempoRestante / 60;
        int segundos = tempoRestante % 60;
        
        String tempoText = String.format("%02d:%02d", minutos, segundos);
        
        tempo.setText(tempoText);
        
        tempoRestante--;
        if(tempoRestante < 0){
            timer.stop();
            start.setEnabled(true);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton start;
    private javax.swing.JLabel tempo;
    // End of variables declaration//GEN-END:variables
}
