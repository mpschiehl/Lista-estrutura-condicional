import javax.swing.JOptionPane;
public class ExercicioExtrutura2{
    public static void main(String[] args){
        double numero= Double.parseDouble(JOptionPane.showInputDialog("Informe um numero"));

        double positivo = 0, negativo =0;
        if(numero<0){
            JOptionPane.showMessageDialog(null, "O Numero " + numero + " e negativo");
        }else{
            JOptionPane.showMessageDialog(null, "O Numero " + numero + " Não e negativo");
        }
    }
}