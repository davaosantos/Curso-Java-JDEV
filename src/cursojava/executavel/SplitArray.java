package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

    public static void main(String[] args) {
        String text = "David, Curso Java, 80, 90";

        String[] valoresArray = text.split(",");


        //System.out.println("Nome: " + );

        System.out.println(text);
        System.out.println("Nome: " + valoresArray[0]);
        System.out.println("Curso: " + valoresArray[1]);
        System.out.println("Nota 1: " + valoresArray[2]);
        System.out.println("Nota 2: " + valoresArray[3]);


        /*Convertendo um array em uma lista*/
        List<String> list = Arrays.asList(valoresArray);
        for (String valorString : list) {
            System.out.println(valorString);
        }

        System.out.println("Nova conversao");

        /*Convert de lista para array*/
        String[] conversaoArray = list.toArray(new String[4]);
        for (int pos = 0; pos < conversaoArray.length; pos++){
            System.out.println(conversaoArray[pos]);
        }

    }


}
