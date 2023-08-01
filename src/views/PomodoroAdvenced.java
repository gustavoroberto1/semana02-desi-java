package views;

import enums.Status;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.Timer;

public class PomodoroAdvenced extends javax.swing.JFrame {

    public PomodoroAdvenced() {
        initComponents();
        this.time = this.createTimer();
    }
    
    private Timer time;
    
    private final int FOCUS_TIME = 25;
    private final int FAST_BREAK_TIME = 5;
    private final int LONG_BREAK_TIME = 15;
    private final int ROUNDS = 4;
    
    private int focusTime = 25;
    private int fastBreakTime = 5;
    private int longBreakTime = 15;
    private int rounds = 4;
    
    private int tempoRestante = 25 * 60;
    private boolean isStopped = true;
    
    private Status statusAtual = Status.PAUSED;
    private Status statusAnterior = null;
    
    private int countRound = 0;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        timer = new javax.swing.JPanel();
        timerLabel = new javax.swing.JLabel();
        playAndPauseButton = new javax.swing.JLabel();
        settingsButton = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        focusTimeSlider = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        focusTimeLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        breakFastLabel = new javax.swing.JLabel();
        breakFastSlider = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        breakLongLabel = new javax.swing.JLabel();
        breakLongSlider = new javax.swing.JSlider();
        roundsLabel = new javax.swing.JLabel();
        roundsSlider = new javax.swing.JSlider();
        jLabel9 = new javax.swing.JLabel();
        applyButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        main.setPreferredSize(new java.awt.Dimension(348, 438));
        main.setLayout(new java.awt.CardLayout());

        timerLabel.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        timerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerLabel.setText("25:00");

        playAndPauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/play.png"))); // NOI18N
        playAndPauseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playAndPauseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playAndPauseButtonMouseClicked(evt);
            }
        });

        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/engrenagem.png"))); // NOI18N
        settingsButton.setToolTipText("");
        settingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLabel.setText("TEMPO DE FOCO");
        statusLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout timerLayout = new javax.swing.GroupLayout(timer);
        timer.setLayout(timerLayout);
        timerLayout.setHorizontalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(timerLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playAndPauseButton))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(settingsButton)
                .addGap(18, 18, 18))
        );
        timerLayout.setVerticalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(settingsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playAndPauseButton)
                .addGap(42, 42, 42)
                .addComponent(statusLabel)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        main.add(timer, "timer");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/claro.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        focusTimeSlider.setMaximum(50);
        focusTimeSlider.setMinimum(1);
        focusTimeSlider.setValue(25);
        focusTimeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                focusTimeSliderStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tempo de Foco");

        focusTimeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        focusTimeLabel.setText("25:00");
        focusTimeLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Break Curto");

        breakFastLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        breakFastLabel.setText("5:00");
        breakFastLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        breakFastSlider.setMaximum(15);
        breakFastSlider.setMinimum(1);
        breakFastSlider.setValue(5);
        breakFastSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                breakFastSliderStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Break Longo");

        breakLongLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        breakLongLabel.setText("15:00");
        breakLongLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        breakLongSlider.setMaximum(30);
        breakLongSlider.setMinimum(1);
        breakLongSlider.setValue(15);
        breakLongSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                breakLongSliderStateChanged(evt);
            }
        });

        roundsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        roundsLabel.setText("25:00");
        roundsLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        roundsSlider.setMaximum(10);
        roundsSlider.setMinimum(1);
        roundsSlider.setValue(3);
        roundsSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                roundsSliderStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Rounds");

        applyButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        applyButton.setText("Aplicar");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resetButton.setText("Reset Default");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsLayout = new javax.swing.GroupLayout(settings);
        settings.setLayout(settingsLayout);
        settingsLayout.setHorizontalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(breakFastSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(breakFastLabel))
                            .addComponent(breakLongSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(breakLongLabel))
                            .addComponent(roundsSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(focusTimeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(roundsLabel))))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel2))
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(focusTimeLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))))
            .addGroup(settingsLayout.createSequentialGroup()
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel4))
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel6)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(applyButton)
                .addGap(26, 26, 26))
        );
        settingsLayout.setVerticalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(focusTimeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(focusTimeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addComponent(breakFastLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(breakFastSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(breakLongLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(breakLongSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundsSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyButton)
                    .addComponent(resetButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main.add(settings, "settings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
        changePanel("settings");
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        changePanel("timer");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void focusTimeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_focusTimeSliderStateChanged
        changeValueSlider(this.focusTimeSlider, this.focusTimeLabel);
    }//GEN-LAST:event_focusTimeSliderStateChanged

    private void breakFastSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_breakFastSliderStateChanged
        changeValueSlider(this.breakFastSlider, this.breakFastLabel);
    }//GEN-LAST:event_breakFastSliderStateChanged

    private void breakLongSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_breakLongSliderStateChanged
        changeValueSlider(this.breakLongSlider, this.breakLongLabel);   
    }//GEN-LAST:event_breakLongSliderStateChanged

    private void roundsSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_roundsSliderStateChanged
        changeValueSlider(this.roundsSlider, this.roundsLabel);
    }//GEN-LAST:event_roundsSliderStateChanged

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        this.focusTimeSlider.setValue(this.FOCUS_TIME);
        this.breakFastSlider.setValue(this.FAST_BREAK_TIME);
        this.breakLongSlider.setValue(this.LONG_BREAK_TIME);
        this.roundsSlider.setValue(this.ROUNDS);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        this.focusTime = this.focusTimeSlider.getValue();
        this.fastBreakTime = this.breakFastSlider.getValue();
        this.longBreakTime = this.breakLongSlider.getValue();
        this.rounds = this.roundsSlider.getValue();
        this.tempoRestante = this.focusTime * 60;
        int minutos = this.tempoRestante / 60;
        int segundos = this.tempoRestante % 60;
        timerLabel.setText(String.format("%02d:%02d", minutos, segundos));
        changePanel("timer");
    }//GEN-LAST:event_applyButtonActionPerformed

    private void playAndPauseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playAndPauseButtonMouseClicked
        if(isStopped){
            this.time.start();
            this.playAndPauseButton.setIcon(new ImageIcon(getClass().getResource("/assets/pause.png")));
            
            if(statusAnterior == null){
                statusAtual = Status.FOCUS_TIME;
            }else {
                statusAtual = statusAnterior;        
            }
            statusAnterior = Status.PAUSED;
        }else {
            this.time.stop();
            this.playAndPauseButton.setIcon(new ImageIcon(getClass().getResource("/assets/play.png")));
        }
        this.isStopped = !this.isStopped;
    }//GEN-LAST:event_playAndPauseButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JLabel breakFastLabel;
    private javax.swing.JSlider breakFastSlider;
    private javax.swing.JLabel breakLongLabel;
    private javax.swing.JSlider breakLongSlider;
    private javax.swing.JLabel focusTimeLabel;
    private javax.swing.JSlider focusTimeSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel main;
    private javax.swing.JLabel playAndPauseButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel roundsLabel;
    private javax.swing.JSlider roundsSlider;
    private javax.swing.JPanel settings;
    private javax.swing.JLabel settingsButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel timer;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables

    private void changePanel(String cardName) {
        CardLayout cardLayout = (CardLayout) this.main.getLayout();
        cardLayout.show(this.main, cardName);
    }
    
    private void changeValueSlider(JSlider slider, JLabel label){
        int value = slider.getValue();
        String valueFormat = String.format("%02d:%02d", value, 00);
        label.setText(valueFormat);
    }
    
    private Timer createTimer(){
        return new Timer(1000,(ActionEvent e) -> {
            updateTimer();
        });
    }
    
    private void updateTimer(){
        this.tempoRestante--;
        int minutos = this.tempoRestante / 60;
        int segundos = this.tempoRestante % 60;
        this.timerLabel.setText(String.format("%02d:%02d", minutos, segundos));
        if(this.tempoRestante <= 0){
            this.changeStatus();
        }
    }
    
    private void changeStatus(){
        if(this.statusAtual == Status.FOCUS_TIME && this.rounds == this.countRound){
            this.statusAtual = Status.BREAK_LONG;
            this.statusAnterior = Status.FOCUS_TIME;
            this.countRound = 0;
            this.tempoRestante = this.longBreakTime * 60; 
        }else if(this.statusAtual == Status.FOCUS_TIME && this.rounds != this.countRound){
            this.statusAtual = Status.BREAK_FAST;
            this.statusAnterior = Status.FOCUS_TIME;
            this.countRound--;
            this.tempoRestante = this.fastBreakTime * 60;
        }else if(this.statusAtual == Status.BREAK_FAST){
            this.statusAtual = Status.FOCUS_TIME;
            this.statusAnterior = Status.BREAK_FAST;
            this.tempoRestante = this.focusTime * 60;
            this.countRound--;
        }else if(this.statusAtual == Status.BREAK_LONG){
            this.statusAtual = Status.FOCUS_TIME;
            this.statusAnterior = Status.BREAK_LONG;
            this.tempoRestante = this.focusTime * 60;
            this.countRound--;
        }
    }
}   




