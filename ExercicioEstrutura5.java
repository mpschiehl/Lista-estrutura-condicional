import javax.swing.JOptionPane;
public class ExercicioEstrutura5{
    public static void main(String[] args){
         // solicita numero
    double numeroT = Double.parseDouble(JOptionPane.showInputDialog("informe um numero"));
        // processamento
    if(numeroT==0){
        JOptionPane.showMessageDialog(null, "Zero e um numero impar");
    }else if(numeroT%2!=0){
        JOptionPane.showMessageDialog(null, "Este numero e Impar");
    }else{
        JOptionPane.showMessageDialog(null, "Este numero não e impar");
    }
    }
}