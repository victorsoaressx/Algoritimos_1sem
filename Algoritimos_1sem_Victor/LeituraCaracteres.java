//Ler uma string e obter algumas letras usando o metodo char

import javax.swing.JOptionPane;

public class LeituraCaracteres{
    public static void main(String[] args){
        String s;
        s = JOptionPane.showInputDialog(" Digite uma palavra: ");
        char letra1 = s.charAt(0);
        JOptionPane.showMessageDialog(null, " A primeira letra é: " + letra1);
        JOptionPane.showMessageDialog(null," O tamanha da palavra é: " + s.length());

        int posicao = Integer.parseInt(JOptionPane.showInputDialog(" Escolha uma posicao: "));

        char outraLetra = s.charAt(posicao -1);

        JOptionPane.showMessageDialog(null," Letra da posição " + posicao + " é " + outraLetra);

        if(posicao <= s.length() && posicao > 0){
            char outraLetra = s.charAt(posicao -1);
            JOptionPane.showMessageDialog(null," Letra da posição " + posicao + " é " + outraLetra);
        }


        else{
            JOptionPane.showMessageDialog(null," posicação fora do limite ", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
}