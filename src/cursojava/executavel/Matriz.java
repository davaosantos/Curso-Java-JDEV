package cursojava.executavel;

public class Matriz {

    /*Executar codigo java*/
    public static void main(String[] args) {
        int notas[][] =  new int[2][3];

        notas[0][0] = 80;
        notas[0][1] = 90;
        notas[0][2] = 50;

        notas[1][0] = 40;
        notas[1][1] = 90;
        notas[1][2] = 30;

        /*Percorre as linhas*/
        for(int posLinha = 0; posLinha < notas.length; posLinha++){

            System.out.println("====================================");
            /*Para cada linha , percorre as colunas  ARRAY para a linha*/
            for(int posColuna = 0; posColuna < notas[posLinha].length; posColuna++){
                System.out.println("Valora da matriz: " + notas[posLinha][posColuna]);
            }

        }

    }
}
