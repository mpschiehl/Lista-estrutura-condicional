import javax.swing.JOptionPane;

public class ExercicioEstrutura8 {
public static void main(String[] args) {
    double valorItem = 0;
    String cupon =""; 
    String item = JOptionPane.showInputDialog(null,
    "Tipo        Nome                                       Valor "
    +"\nBolos   Bolo Brigadeiro                     R$ 29,50"
    +"\nBolos   Bolo Floresta Negra             R$ 2,00"
    +"\nBolo     Leite com Nutella                  R$ 29,23"
    +"\nBolos   Bolo Mouse de Chocolate   R$ 7,10"
    +"\nBolos   Bolo Nega Maluca                 R$ 19,33"
    +"\nDoces    Bomba de Creme                R$ 17,71"
    +"\n-----------------------------------------------------------"
    +"\nSelecione o Produto", "Padaria do João",JOptionPane.QUESTION_MESSAGE,null, new Object[]{"", "Bolo Brigadeiro","Bolo Floresta Negra","Bolo Leite com Nutella","Bolo Mousse de Chocolate","Bolo Nega Maluca"},"" ).toString();
    if(item.equals("Bolo Brigadeiro")){
        cupon += "\nBolo Brigadeiro         R$ 29,50";
        valorItem += 29.50;
    }else if(item.equals("Bolo Floresta Negra")){
        cupon += "\nBolo Floresta Negra        R$ 2.00\n";
        valorItem += 2;
    }else if(item.equals("Bolo Leite com Nutella")){
        cupon += "\nBolo Leite com Nutella        R$ 29,23";
        valorItem += 29.23;

    }else if(item.equals("Bolo Mousse de Chocolate")){
        cupon += "\nBolo Mousse de Chocolate      R$ 7,10";
        valorItem += 7.10;
    }else if(item.equals("Bolo Nega Maluca")){
        cupon = "Bolo Nega Maluca              R$ 19,33";
    }
    JOptionPane.showMessageDialog(null,cupon+" "+valorItem);
}
    
}