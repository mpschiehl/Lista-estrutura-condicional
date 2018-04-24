import javax.swing.JOptionPane;

public class ExercicioEstrutura8 {
public static void main(String[] args) {
    // primeira tela apresentação e solicitação do pedido
    String pedido1 = JOptionPane.showInputDialog(null,
        "Tipo        Nome                                       Valor "
        +"\nBolos   Bolo Brigadeiro                     R$ 29,50"
        +"\nBolos   Bolo Floresta Negra             R$ 2,00"
        +"\nBolo     Leite com Nutella                  R$ 29,23"
        +"\nBolos   Bolo Mouse de Chocolate   R$ 7,10"
        +"\nBolos   Bolo Nega Maluca                 R$ 19,33"
        +"\nDoces    Bomba de Creme                R$ 17,71"
        +"\nDoces    Bomba de Morango            R$ 4,82"
        +"\nSanduíche Filé-Mignon com"
        +"\nfritas e cheddar                                   R$ 21,16"
        +"\nSanduíche Hambúrguer com"
        +"\n queijos,champignon e rúcula          R$ 12,70"
        +"\nSanduíche Provolone e salame       R$ 19,70"
        +"\nSanduíche Vegetariano berinjela    R$ 28,22"
        +"\nPizza Calabresa                                   R$ 8,98"
        +"\nPizzas Napolitana                                R$ 0,42"
        +"\nPizzas Peruana                                    R$ 18,36"
        +"\nPizzas Portuguesa                              R$ 27,50"
        +"\n-----------------------------------------------------------"
        +"\nSelecione o Produto", "Padaria do João",JOptionPane.QUESTION_MESSAGE,null, new Object[]
        {"", "Bolo Brigadeiro","Bolo Floresta Negra","Bolo Leite com Nutella","Bolo Mousse de Chocolate","Bolo Nega Maluca","Bomba de Creme","Bomba de Morango","Sanduíche Filé-Mignon fritas e cheddar","Sanduíche Hambúrguer queijos,champignon e rúcula","Sanduíche Provolone e salame","Sanduíche Vegetariano berinjela","Pizza Calabresa","Pizzas Napolitana","Pizzas Peruana","Pizzas Portuguesa"},"" ).toString();
        double valor1 = 0;
        if (pedido1.equals("")){
            pedido1 = "------------------------------R$ 0,00";
        }else if(pedido1.equals("Bolo Brigadeiro")){
            pedido1 = "Bolo Brigadeiro               R$ 29,50";
            valor1 = 29.50;
        }else if(pedido1.equals("Bolo Floresta Negra")){
            pedido1 = "Bolo Floresta Negra           R$ 2,00";
            valor1 = 2;
        }else if(pedido1.equals("Bolo Leite com Nutella")){
            pedido1 = "Bolo Leite com Nutella        R$ 29,23";
            valor1 = 29.23;
        }else if (pedido1.equals("Bolo Mousse de Chocolate")){
            pedido1 = "Bolo Mousse de Chocolate      R$ 7,10";
            valor1 = 7.10;
        }else if (pedido1.equals("Bolo Nega Maluca")){
            pedido1 = "Bolo Nega Maluca              R$ 19,33";
            valor1 = 19.33;
        }else if(pedido1.equals("Bomba de Creme")){
            pedido1 = "Bomba de Creme                R$ 17,71";
            valor1 = 17.71;
        }else if(pedido1.equals("Bomba de Morango")){
            pedido1 = "Bomba de Morango              R$ 4,82";
            valor1 = 4.82;
        }else if(pedido1.equals("Sanduíche Filé-Mignon fritas e cheddar")){
            pedido1 = "Sanduíche Filé-Mignon-fritas-cheddar R$ 21,16";
            valor1 = 21.16;
        }else if(pedido1.equals("Sanduíche Hambúrguer queijos,champignon e rúcula")){
            pedido1 = "Sanduíche Hambúrguer queijos,champignon e rúcula R$ 12,70";
            valor1 = 12.7;
        }else if(pedido1.equals("Sanduíche Provolone e salame")){
            pedido1 = "Sanduíche Provolone e salame       R$ 19,70";
            valor1 = 19.70;
        }else if (pedido1.equals("Sanduíche Vegetariano berinjela")){
            pedido1 = "Sanduíche Vegetariano berinjela     R$ 28,22";
            valor1 = 28.22;
        }else if(pedido1.equals("Pizza Calabresa")){
            pedido1 = "Pizza Calabresa                    R$ 8,98";
            valor1 = 8.98;
        }else if(pedido1.equals("Pizzas Napolitana")){
            pedido1 = "Pizzas Napolitana                   R$ 0,42";
            valor1 = 0.42;
        }else if(pedido1.equals("Pizzas Peruana")){
            pedido1 = "Pizzas Peruana               R$ 18,36";
            valor1 = 18.36;
        }else if (pedido1.equals("Pizzas Portuguesa")){
            pedido1 = "Pizzas Portuguesa          R$ 27,50";
            valor1 = 27.50;
        }

        //Segunda tela apresentação e solicitação do pedido
        String pedido2 = JOptionPane.showInputDialog(null,
        "Tipo        Nome                                       Valor "
        +"\nBolos   Bolo Brigadeiro                     R$ 29,50"
        +"\nBolos   Bolo Floresta Negra             R$ 2,00"
        +"\nBolo     Leite com Nutella                  R$ 29,23"
        +"\nBolos   Bolo Mouse de Chocolate   R$ 7,10"
        +"\nBolos   Bolo Nega Maluca                 R$ 19,33"
        +"\nDoces    Bomba de Creme                R$ 17,71"
        +"\nDoces    Bomba de Morango            R$ 4,82"
        +"\nSanduíche Filé-Mignon com"
        +"\nfritas e cheddar                                   R$ 21,16"
        +"\nSanduíche Hambúrguer com"
        +"\n queijos,champignon e rúcula          R$ 12,70"
        +"\nSanduíche Provolone e salame       R$ 19,70"
        +"\nSanduíche Vegetariano berinjela    R$ 28,22"
        +"\nPizza Calabresa                                   R$ 8,98"
        +"\nPizzas Napolitana                                R$ 0,42"
        +"\nPizzas Peruana                                    R$ 18,36"
        +"\nPizzas Portuguesa                              R$ 27,50"
        +"\n-----------------------------------------------------------"
        +"\nSelecione o Produto", "Padaria do João",JOptionPane.QUESTION_MESSAGE,null, new Object[]
        {"", "Bolo Brigadeiro","Bolo Floresta Negra","Bolo Leite com Nutella","Bolo Mousse de Chocolate","Bolo Nega Maluca","Bomba de Creme","Bomba de Morango","Sanduíche Filé-Mignon fritas e cheddar","Sanduíche Hambúrguer queijos,champignon e rúcula","Sanduíche Provolone e salame","Sanduíche Vegetariano berinjela","Pizza Calabresa","Pizzas Napolitana","Pizzas Peruana","Pizzas Portuguesa"},"" ).toString();
        double valor2 = 0;
        if (pedido2.equals("")){
            pedido2 = "------------------------------R$ 0,00";
        }else if(pedido2.equals("Bolo Brigadeiro")){
            pedido2 = "Bolo Brigadeiro               R$ 29,50";
            valor2 = 29.50;
        }else if(pedido2.equals("Bolo Floresta Negra")){
            pedido2 = "Bolo Floresta Negra           R$ 2,00";
            valor2 = 2;
        }else if(pedido2.equals("Bolo Leite com Nutella")){
            pedido2 = "Bolo Leite com Nutella        R$ 29,23";
            valor2 = 29.23;
        }else if (pedido2.equals("Bolo Mousse de Chocolate")){
            pedido2 = "Bolo Mousse de Chocolate      R$ 7,10";
            valor2 = 7.10;
        }else if (pedido2.equals("Bolo Nega Maluca")){
            pedido2 = "Bolo Nega Maluca              R$ 19,33";
            valor2 = 19.33;
        }else if(pedido2.equals("Bomba de Creme")){
            pedido2 = "Bomba de Creme                R$ 17,71";
            valor2 = 17.71;
        }else if(pedido2.equals("Bomba de Morango")){
            pedido2 = "Bomba de Morango              R$ 4,82";
            valor2 = 4.82;
        }else if(pedido2.equals("Sanduíche Filé-Mignon fritas e cheddar")){
            pedido2 = "Sanduíche Filé-Mignon-fritas-cheddar R$ 21,16";
            valor2 = 21.16;
        }else if(pedido2.equals("Sanduíche Hambúrguer queijos,champignon e rúcula")){
            pedido2 = "Sanduíche Hambúrguer queijos,champignon e rúcula R$ 12,70";
            valor2 = 12.7;
        }else if(pedido2.equals("Sanduíche Provolone e salame")){
            pedido2 = "Sanduíche Provolone e salame       R$ 19,70";
            valor2 = 19.70;
        }else if (pedido2.equals("Sanduíche Vegetariano berinjela")){
            pedido2 = "Sanduíche Vegetariano berinjela     R$ 28,22";
            valor2 = 28.22;
        }else if(pedido2.equals("Pizza Calabresa")){
            pedido2 = "Pizza Calabresa                    R$ 8,98";
            valor2 = 8.98;
        }else if(pedido2.equals("Pizzas Napolitana")){
            pedido2 = "Pizzas Napolitana                   R$ 0,42";
            valor2 = 0.42;
        }else if(pedido2.equals("Pizzas Peruana")){
            pedido2 = "Pizzas Peruana               R$ 18,36";
            valor2 = 18.36;
        }else if (pedido2.equals("Pizzas Portuguesa")){
            pedido2 = "Pizzas Portuguesa          R$ 27,50";
            valor2 = 27.50;
        }

        //segunda tela
        String pedido3 =  JOptionPane.showInputDialog(null,
        "Tipo        Nome                                       Valor "
        +"\nBolos   Bolo Brigadeiro                     R$ 29,50"
        +"\nBolos   Bolo Floresta Negra             R$ 2,00"
        +"\nBolo     Leite com Nutella                  R$ 29,23"
        +"\nBolos   Bolo Mouse de Chocolate   R$ 7,10"
        +"\nBolos   Bolo Nega Maluca                 R$ 19,33"
        +"\nDoces    Bomba de Creme                R$ 17,71"
        +"\nDoces    Bomba de Morango            R$ 4,82"
        +"\nSanduíche Filé-Mignon com"
        +"\nfritas e cheddar                                   R$ 21,16"
        +"\nSanduíche Hambúrguer com"
        +"\n queijos,champignon e rúcula          R$ 12,70"
        +"\nSanduíche Provolone e salame       R$ 19,70"
        +"\nSanduíche Vegetariano berinjela    R$ 28,22"
        +"\nPizza Calabresa                                   R$ 8,98"
        +"\nPizzas Napolitana                                R$ 0,42"
        +"\nPizzas Peruana                                    R$ 18,36"
        +"\nPizzas Portuguesa                              R$ 27,50"
        +"\n-----------------------------------------------------------"
        +"\nSelecione o Produto", "Padaria do João",JOptionPane.QUESTION_MESSAGE,null, new Object[]
        {"", "Bolo Brigadeiro","Bolo Floresta Negra","Bolo Leite com Nutella","Bolo Mousse de Chocolate","Bolo Nega Maluca","Bomba de Creme","Bomba de Morango","Sanduíche Filé-Mignon fritas e cheddar","Sanduíche Hambúrguer queijos,champignon e rúcula","Sanduíche Provolone e salame","Sanduíche Vegetariano berinjela","Pizza Calabresa","Pizzas Napolitana","Pizzas Peruana","Pizzas Portuguesa"},"" ).toString();
        double valor3 = 0;
        if (pedido3.equals("")){
            pedido3 = "------------------------------R$ 0,00";
        }else if(pedido3.equals("Bolo Brigadeiro")){
            pedido3 = "Bolo Brigadeiro               R$ 29,50";
            valor3 = 29.50;
        }else if(pedido3.equals("Bolo Floresta Negra")){
            pedido3 = "Bolo Floresta Negra           R$ 2,00";
            valor3 = 2;
        }else if(pedido3.equals("Bolo Leite com Nutella")){
            pedido3 = "Bolo Leite com Nutella        R$ 29,23";
            valor3 = 29.23;
        }else if (pedido3.equals("Bolo Mousse de Chocolate")){
            pedido3 = "Bolo Mousse de Chocolate      R$ 7,10";
            valor3 = 7.10;
        }else if (pedido3.equals("Bolo Nega Maluca")){
            pedido3 = "Bolo Nega Maluca              R$ 19,33";
            valor3 = 19.33;
        }else if(pedido3.equals("Bomba de Creme")){
            pedido3 = "Bomba de Creme                R$ 17,71";
            valor3 = 17.71;
        }else if(pedido3.equals("Bomba de Morango")){
            pedido3 = "Bomba de Morango              R$ 4,82";
            valor3 = 4.82;
        }else if(pedido3.equals("Sanduíche Filé-Mignon fritas e cheddar")){
            pedido3 = "Sanduíche Filé-Mignon-fritas-cheddar R$ 21,16";
            valor3 = 21.16;
        }else if(pedido3.equals("Sanduíche Hambúrguer queijos,champignon e rúcula")){
            pedido3 = "Sanduíche Hambúrguer queijos,champignon e rúcula R$ 12,70";
            valor3 = 12.7;
        }else if(pedido3.equals("Sanduíche Provolone e salame")){
            pedido3 = "Sanduíche Provolone e salame       R$ 19,70";
            valor3 = 19.70;
        }else if (pedido3.equals("Sanduíche Vegetariano berinjela")){
            pedido3 = "Sanduíche Vegetariano berinjela     R$ 28,22";
            valor3 = 28.22;
        }else if(pedido3.equals("Pizza Calabresa")){
            pedido3 = "Pizza Calabresa                    R$ 8,98";
            valor3 = 8.98;
        }else if(pedido3.equals("Pizzas Napolitana")){
            pedido3 = "Pizzas Napolitana                   R$ 0,42";
            valor3 = 0.42;
        }else if(pedido3.equals("Pizzas Peruana")){
            pedido3 = "Pizzas Peruana               R$ 18,36";
            valor3 = 18.36;
        }else if (pedido3.equals("Pizzas Portuguesa")){
            pedido3 = "Pizzas Portuguesa          R$ 27,50";
            valor3 = 27.50;
        }
        double total= valor1 + valor2 + valor3;        
        JOptionPane.showMessageDialog(null,"\n" + pedido1 + "\n" + pedido2 + "\n" + pedido3+ "\nTotal:     "+ total);
    
}
}