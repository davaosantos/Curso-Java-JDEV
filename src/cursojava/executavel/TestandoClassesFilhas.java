package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("David");
        aluno.setIdade(16);

        Diretor diretor = new Diretor();
        diretor.setNome("Rob");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setRegistro("Seila");
        secretario.setIdade(18);

        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        System.out.println(diretor.pessoaMaiorIdade());
        System.out.println("Salário é = " + secretario.salario());

    }
}
