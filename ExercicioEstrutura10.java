import javax.swing.JOptionPane;

public class ExercicioEstrutura10{
    public static void main (String[] args){
        int numero1 =Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Numero","Primeiro          Numero",JOptionPane.QUESTION_MESSAGE)),
            numero2 =Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o Segundo Numero","Segundo Numero",JOptionPane.QUESTION_MESSAGE)),
            numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o terceiro Numero","Terceiro Numero",JOptionPane.PLAIN_MESSAGE)),
            numero4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o quarto Numero","Quarto numero",JOptionPane.QUESTION_MESSAGE));
        if((numero1==numero3 && numero2==numero4) ||(numero2==numero4 && numero1==numero3)){
            JOptionPane.showMessageDialog(null, "E um retangulo");
        }else{
            JOptionPane.showMessageDialog(null, "Não e um retangulo");
        }
    }
}