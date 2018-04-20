import javax.swing.JOptionPane;

public class ExercicioEstrutura7{
    public static void main(String[] args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um Numero"));
        String panel ="";
        if(numero==0){
          panel += numero +" e Neutro\n";
        }if(numero%2==0){
            panel += numero + " e par\n";
        }
        if(numero%2!=0){
            panel += numero + " e impar\n";  
        }
        if (numero>0){
           panel += numero + " e positivo\n";
        }
        if(numero > 10){
            panel += numero + " e maior que 10\n"; 
        }
        if(numero<=50){
            panel += numero + " e menor ou igual a 50\n";    
        }
        if(numero<-10){
            panel += numero + " e menor que -10\n";
        }
        if(numero>=30){
            panel += numero +" e maior ou igual a 30\n";
        }
        if(numero !=1){
            panel += numero + " e diferente de 1\n";
        }

        JOptionPane.showMessageDialog(null, panel);   
    }
}