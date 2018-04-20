import javax.swing.JOptionPane;

public class ExercicioEstrutura3{
    public static void main(String[] args){
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o Primeiro Valor")),numero2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o Segundo  Valor"));
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("   Menu \n1   somar \n2   Subtrair \n3   Multiplicar \n4   Dividir"));

        double resultado = 0;
        if(opcao==1){
            resultado = numero1 + numero2;
        JOptionPane.showMessageDialog(null,numero1 + " + " +numero2 +" = "+ resultado);
        }else if(opcao==2){
           resultado = numero1 - numero2;
            JOptionPane.showMessageDialog(null,numero1 + " - " +numero2 +" = "+ resultado);       
        }else if(opcao==3){
           resultado = numero1 * numero2;
        JOptionPane.showMessageDialog(null,numero1 + " x " +numero2 +" = "+ resultado);
        }else if(opcao==4){
            resultado = numero1/numero2;
        JOptionPane.showMessageDialog(null,numero1 + " / " +numero2 +" = "+ resultado);
        }else{
            JOptionPane.showMessageDialog(null,"Opção não disponivel");
        }
    }
}