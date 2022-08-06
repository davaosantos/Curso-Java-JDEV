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


        // Aluno 2

        /*Criação do aluno*/
        Aluno aluno2 = new Aluno();
        aluno.setNome("David");
        aluno.setNomeEscola("SHINGEKI curso");

        /*Criação da disciplina*/
        Disciplina disciplinaB = new Disciplina();
        disciplina.setDisciplina("Curso de java");
        disciplina.setNota(notas);

        aluno.getDisciplinas().add(disciplinaB);

        Disciplina disciplinaB2 = new Disciplina();
        disciplina.setDisciplina("Lógica");
        disciplina2.setNota(notasPortugues);

        aluno.getDisciplinas().add(disciplinaB2);

        Disciplina disciplinaB3 = new Disciplina();
        disciplina3.setDisciplina("Culinaria");
        disciplina3.setNota(notasCulinaria);

        aluno.getDisciplinas().add(disciplinaB3);

        //------------------------------------------

        Aluno[] arrayAluno = new Aluno[1]; // cria um array de aluno , com tamanho 1

        arrayAluno[0] = aluno; // recebe o objeto aluno
        arrayAluno[1] = aluno2; // recebe o objeto aluno

        for (int pos = 0; pos < arrayAluno.length; pos++){
            System.out.println("Nome do aluno é: " + arrayAluno[pos].getNome());

            for (Disciplina disc: arrayAluno[pos].getDisciplinas()) {
                System.out.println("Nome da disciplina é : " + disc.getDisciplina());

                for(int posNota = 0 ; posNota < disc.getNota().length; posNota++){
                    System.out.println("A nota numero " + (posNota+1) + " foi : " + disc.getNota()[posNota]);
                }
            }
        }

    }
}
