import javax.swing.JOptionPane;

public class ExercicioEstrutura9{
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "informe um numero","Primeiro Numero",JOptionPane.PLAIN_MESSAGE)), 
            numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um Sengundo Numero", "Segundo Numero",JOptionPane.INFORMATION_MESSAGE)),
            numero3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Terceiro Numero","Terceiro Numero",JOptionPane.QUESTION_MESSAGE)),
            numero4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o quarto numero", "Quarto Numero",JOptionPane.PLAIN_MESSAGE));

        if(numero1==numero2 && numero3==numero4){
            JOptionPane.showMessageDialog(null, "E Um quadrado perfeito","Resultado",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Não e um Quadrado","Resultado",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}