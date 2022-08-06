package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;


import javax.swing.*;
import java.util.ArrayList;

public class ArrayVetor {

    public static void main(String[] args) {
        double[] notas = {5.0 , 3.0, 9.0, 6.6};
        double[] notasPortugues = {5.0 , 23, 9.0, 6.6};
        double[] notasCulinaria = {10, 9, 5, 7.3};

        /*Criação do aluno*/
        Aluno aluno = new Aluno();
        aluno.setNome("Fernanda");
        aluno.setNomeEscola("SHINGEKI curso");

        /*Criação da disciplina*/
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso de java");
        disciplina.setNota(notas);

        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina.setDisciplina("Lógica");
        disciplina2.setNota(notasPortugues);

        aluno.getDisciplinas().add(disciplina2);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Culinaria");
        disciplina3.setNota(notasCulinaria);

        aluno.getDisciplinas().add(disciplina3);

        System.out.println("Nome do aluno : " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
        System.out.println("----- Disciplina do aluno ------");

        for (Disciplina disc: aluno.getDisciplinas()) {

            System.out.println("Disciplina: " + aluno.getDisciplinas());
            System.out.println("As notas da disciplina são: ");

            double notaMax = 0.0;
            double notaMenor = 0.0;
            for(int pos = 0; pos < disc.getNota().length; pos++){
                System.out.println("Nota: " + (pos + 1) + " é igual a = " + disc.getNota()[pos]);

                if(pos == 0){
                    notaMax = disc.getNota()[pos];
                    notaMenor = disc.getNota()[pos];
                }else{
                    if (disc.getNota()[pos] > notaMax){
                        notaMax = disc.getNota()[pos];
                    }else if(disc.getNota()[pos] < notaMenor){
                        notaMenor = disc.getNota()[pos];
                    }
                }
            }

            System.out.println("A maior nota da disciplina " + disc.getDisciplina() + " foi : " + notaMax);
            System.out.println("A menor nota da disciplina " + disc.getDisciplina() + " foi : " + notaMenor);
        }
    }
}
