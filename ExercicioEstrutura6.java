import javax.swing.JOptionPane;
 public class ExercicioEstrutura6{
     public static void main(String[] args){
         int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
        
    if(numero != 1){
        JOptionPane.showMessageDialog(null, numero +"Numero diferente de 1");
    }
     }
 }