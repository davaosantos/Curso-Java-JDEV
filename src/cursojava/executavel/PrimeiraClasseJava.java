package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/**
	 * M�todo padr�o que executa os programas escritos em Java
	 */
	public static void main(String[] args) {
		
		// new Aluno() � uma inst�ncia da classe Aluno (cria��o do objeto)
		// aluno1 � uma refer�ncia para o objeto
		
		// Entrada de dados com o teclado (Dados do aluno)
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		String idade = JOptionPane.showInputDialog("Digite a idade do aluno:");
		String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do aluno:");
		String rg = JOptionPane.showInputDialog("Digite o RG do aluno:");
		String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno:");
		String nomeMae = JOptionPane.showInputDialog("Digite o nome da m�e do aluno:");
		String nomePai = JOptionPane.showInputDialog("Digite o nome do pai do aluno:");
		String dataMatricula = JOptionPane.showInputDialog("Digite a data da matr�cula do aluno:");
		String serieMatriculado = JOptionPane.showInputDialog("Digite a s�rie do aluno:");
		String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola do aluno:");
		
		// Entrada de dados com o teclado (Notas e disciplinas do aluno)
		String disciplina1 = JOptionPane.showInputDialog("Digite o valor da 1� disciplina:");
		String nota1 = JOptionPane.showInputDialog("Digite o valor da 1� nota:");
		
		String disciplina2 = JOptionPane.showInputDialog("Digite o valor da 2� disciplina:");
		String nota2 = JOptionPane.showInputDialog("Digite o valor da 2� nota:");
		
		String disciplina3 = JOptionPane.showInputDialog("Digite o valor da 3� disciplina:");
		String nota3 = JOptionPane.showInputDialog("Digite o valor da 3� nota:");
		
		String disciplina4 = JOptionPane.showInputDialog("Digite o valor da 4� disciplina:");
		String nota4 = JOptionPane.showInputDialog("Digite o valor da 4� nota:");		
		
		System.out.println("===================== ALUNO 1 =======================");	
		Aluno aluno1 = new Aluno(); // Jo�o		
		
		// Dados do aluno1
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(nomeEscola);
		
		// Notas e disciplinas do aluno1
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));		
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		System.out.println(aluno1); // Representa��o textual do objeto
		System.out.println("M�dia das notas do aluno 1 �: " + aluno1.getMediaNota());
		System.out.println("Resultado STRING: " + aluno1.getAlunoAprovadoString());		
	}

}
