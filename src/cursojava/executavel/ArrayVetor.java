package cursojava.executavel;

import javax.swing.*;

public class ArrayVetor {

    public static void main(String[] args) {
        /*Array pode ser de todos os tipos , de dados e objetos tambem*/


        String posicoes = JOptionPane.showInputDialog("Digite o total de posicoes do vetor: ");

        /*Array sempre deve ter a quantidade de posições definidas*/
        double notas[] = new double[Integer.parseInt(posicoes)];

        for(int pos=0; pos < notas.length; pos++){
            String valor = JOptionPane.showInputDialog("Qual o valor da posicao " + (pos+1));
            notas[pos] = Double.parseDouble(valor);
        }

        int tamanho = notas.length;

        for(int i = 0; i < tamanho ; i++){
            System.out.println("Nota " + (i + 1) + " : " + notas[i]);
        }
    }
}
