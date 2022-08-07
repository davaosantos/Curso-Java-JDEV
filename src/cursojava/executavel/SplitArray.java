package cursojava.executavel;

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
    }

}
