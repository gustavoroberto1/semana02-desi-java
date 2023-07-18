package semana02.desi.java;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Semana02DesiJava {

    public static void main(String[] args) {  
        metodoJoption();
    }
    
    public static void metodoJoption(){
        String nome = JOptionPane.showInputDialog("Informe seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?", "Idade", JOptionPane.INFORMATION_MESSAGE));
        
        int compartilhar = JOptionPane.showConfirmDialog(null, "Deseja compartilhar suas informações");
        if(compartilhar == JOptionPane.YES_OPTION){
            System.out.println("Você vai compartilhar suas informações");
        }else if(compartilhar == JOptionPane.NO_OPTION){
            System.out.println("Suas informações não serão compartilhadas");
        }else if(compartilhar == JOptionPane.CANCEL_OPTION){
            System.out.println("Você nao autorizou compartilhamento, finalizamos por aqui!");
            System.exit(0);
        }
        
        
        int confirmar = JOptionPane.showConfirmDialog(null, "Deseja confirmar cadastro!", "Cadastro", JOptionPane.YES_NO_OPTION);
        if(confirmar == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "SEU CADASTRO DEU CERTO " + nome);
        }else if(confirmar == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "DEU BO, A CASA CAIU", "ERRROUUU", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }
    
    
    public static void metodoScanner() {
         // SCANNER
        String nomeAlunos[] = new String[5];
        boolean situacaoAlunos[] = new boolean[5];
        double alturaAlunos[] = new double[5];
        int idadeAlunos[] = new int[5];
        Scanner leitor = new Scanner(System.in);
           
        for(int i = 0; i < nomeAlunos.length; i++){
            System.out.println("Informe seu nome: ");
            nomeAlunos[i] = leitor.nextLine();
            System.out.println("Você estuda?");
            situacaoAlunos[i] = leitor.nextBoolean();
            System.out.println("Qual é a sua altura?");
            alturaAlunos[i] = leitor.nextDouble();
            System.out.println("Qual é a sua idade?");
            idadeAlunos[i] = leitor.nextInt();
        }
        
        for(int i = 0; i < nomeAlunos.length; i++){
            System.out.println("Nome: " + nomeAlunos[i]+ " Estuda: " + situacaoAlunos[i]);
        }

        leitor.useDelimiter(",");

        while(leitor.hasNextInt()){
            int numero = leitor.nextInt();
            System.out.println("Numero: " + numero);
            leitor.skip(",");
        }
    }
    
}
