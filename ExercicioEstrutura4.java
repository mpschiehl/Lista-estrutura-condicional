import javax.swing.JOptionPane;
public class ExercicioEstrutura4{
    public static void main(String[] args){
        // solicita numero
    double numeroT = Double.parseDouble(JOptionPane.showInputDialog("informe um numero"));
        // processamento
    if(numeroT==0){
        JOptionPane.showMessageDialog(null, "Zero e um numero neutro");
    }else if(numeroT%2==0){
        JOptionPane.showMessageDialog(null, "Este numero e Par");
    }else{
        JOptionPane.showMessageDialog(null, "Este numero não e Par");
    }
    }
}