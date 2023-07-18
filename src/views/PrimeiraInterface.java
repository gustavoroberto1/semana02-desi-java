package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraInterface {
 
    public PrimeiraInterface() {
        JFrame janela = new JFrame("Minha Primeira Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setSize(500, 500);
        
        janela.setLayout(null);
        
        JButton botao = new JButton("CLIQUE AQUI");
        botao.setBounds(200, 250, 150, 25);
             
        JLabel texto = new JLabel("TEXTO PADRÃO");
        texto.setBounds(250, 100, 150, 50);
        
        JTextField input = new JTextField();
        input.setBounds(200, 300, 150, 50);      
        
        botao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String mensagem = input.getText();
                texto.setText(mensagem);
            }
        });
        
        janela.add(input);
        janela.add(texto);
        janela.add(botao);
        
        janela.setVisible(true);
    }
    
}
