package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

/**
 * Classe que representa um Aluno
 */
public class Aluno extends Pessoa{

	// Atributos da classe Aluno
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<>(); // Objeto que cont�m a lista de disciplinas e notas do aluno

	// Construtor vazio do objeto (padr�o)
	public Aluno() {

	}

	// Construtor de par�metro �nico
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	// Construtor de dois par�metros
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	// M�todos Setters e Getters
	// SET - Atribui valor aos atributos | GET - recupera o valor dos atributos
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public double salario() {
		return 0;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	// M�todo que calcula e retorna a m�dia das notas do aluno
	public double getMediaNota() {

		double somaNotas = 0.0;

		for (Disciplina disiplina : disciplinas) {
			somaNotas += disiplina.getMediaNotas();
		}

		return somaNotas / disciplinas.size();
	}



	// M�todo que retorna se o aluno foi aprovado ou n�o (STRING)
	public String getAlunoAprovadoString() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;				
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	@Override
	public String toString(){
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}


	/*Identifica metodo sobreescrito*/
	@Override
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
	}

	public String msgMaiorIdade(){
		return this.pessoaMaiorIdade() ? "De maior" : "De menor";
	};
}
