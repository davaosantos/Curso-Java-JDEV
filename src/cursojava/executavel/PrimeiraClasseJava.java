package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesAuxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;
import jdk.net.SocketFlow;

public class PrimeiraClasseJava {

	/**
	 * M�todo padr�o que executa os programas escritos em Java
	 */
	public static void main(String[] args) {

			String login = JOptionPane.showInputDialog("Informe o login: ");
			String senha = JOptionPane.showInputDialog("Informe a senha: ");

		FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();

			PermitirAcesso permitirAcesso = new Secretario(login,senha);

			if(autenticacao.autenticarCursoJava(permitirAcesso)){ /*Vou travar o contrato para autorizar somente quem realmente tem o contrato 100% legitimo*/

			List<Aluno> alunos = new ArrayList<>();

			/*� uma lista que dentro temos uma chave que identifica uma sequencia de valores tambem*/
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for(int qtd = 1; qtd <= 5; qtd ++) {
				
				// new Aluno() � uma inst�ncia da classe Aluno (cria��o do objeto)
				// aluno1 � uma refer�ncia para o objeto
				
				// Entrada de dados com o teclado (Dados do aluno)
				String nome = JOptionPane.showInputDialog("Digite o nome do aluno " + qtd + " :");
				/*String idade = JOptionPane.showInputDialog("Digite a idade do aluno:");
				String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento do aluno:");
				String rg = JOptionPane.showInputDialog("Digite o RG do aluno:");
				String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno:");
				String nomeMae = JOptionPane.showInputDialog("Digite o nome da m�e do aluno:");
				String nomePai = JOptionPane.showInputDialog("Digite o nome do pai do aluno:");
				String dataMatricula = JOptionPane.showInputDialog("Digite a data da matr�cula do aluno:");
				String serieMatriculado = JOptionPane.showInputDialog("Digite a s�rie do aluno:");
				String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola do aluno:");	*/			
				
				Aluno aluno1 = new Aluno();
				
				// Dados do aluno1
				aluno1.setNome(nome);
				/*aluno1.setIdade(Integer.valueOf(idade));
				aluno1.setDataNascimento(dataNascimento);
				aluno1.setRegistroGeral(rg);
				aluno1.setNumeroCpf(cpf);
				aluno1.setNomeMae(nomeMae);
				aluno1.setNomePai(nomePai);
				aluno1.setDataMatricula(dataMatricula);
				aluno1.setSerieMatriculado(serieMatriculado);
				aluno1.setNomeEscola(nomeEscola);*/

				for (int pos = 1; pos <= 1; pos++) {

					String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da " + pos + "� disciplina:");
					String notaDisciplina = JOptionPane.showInputDialog("Digite a nota da " + pos + "� disciplina:");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplinas().add(disciplina);
				}
				
				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
				
				if (escolha == 0) { // Op��o SIM = 0
					
					int continuarRemover = 0;
					int posicao = 1;
					
					while (continuarRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog(null, "Informe a disciplina a ser removida [1, 2, 3 ou 4]");
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao ++; // Incremente 1 ao valor atual da vari�vel posicao
						continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar a remover?");
					}			
				}
				
				alunos.add(aluno1);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

		for (Aluno aluno:alunos) { /* Separado em listas */

			if(aluno.getAlunoAprovadoString().equalsIgnoreCase(StatusAluno.APROVADO)){
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if(aluno.getAlunoAprovadoString().equalsIgnoreCase(StatusAluno.RECUPERACAO)){
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else{
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}

			}

		System.out.println("------------- Lista aprovados -------------");

		for (Aluno aluno: maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado: " + aluno.getAlunoAprovadoString() + " com m�dia de = " + aluno.getMediaNota());
		}


		System.out.println("------------- Lista recupera��o -------------");
		for (Aluno aluno: maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado: " + aluno.getAlunoAprovadoString() + " com m�dia de = " + aluno.getMediaNota());
		}


		System.out.println("------------- Lista reprovados-------------");
		for (Aluno aluno: maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado: " + aluno.getAlunoAprovadoString() + " com m�dia de = " + aluno.getMediaNota());
		}

		}
	}

	}

