import javax.swing.JOptionPane;

import com.sun.media.jfxmedia.Media;

public class ExercicioEstrutura11{
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a sua Primeira Nota","Sistema Educacional",JOptionPane.PLAIN_MESSAGE)),
            nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a sua Segunda Nota","Sistema Educacional",JOptionPane.PLAIN_MESSAGE)),
            nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a sua Terceira Nota", "Sistema Educacional",JOptionPane.PLAIN_MESSAGE)),
            nota4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a sua quarta Nota","Sistema Educacional",JOptionPane.PLAIN_MESSAGE)),
            nota5 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a sua Quinta Nota","Sistema Educacional",JOptionPane.PLAIN_MESSAGE)),
            media = (nota1+nota2+nota3+nota4+nota5)/5;
        
        if (media<6){
            JOptionPane.showMessageDialog(null,"Reprovado");
        }else if(media>5.99 && media<8){
            JOptionPane.showMessageDialog(null, "Recuperação");
        }else if(media>7.99){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
    }
}