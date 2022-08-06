package cursojava.classes;

/**
 * Classe que representa uma Disciplina
 */
public class Disciplina {

	/*Cada disciplina tera 4 notas no ano inteiro*/
	private double[] nota = new double[4];

	// Notas e disciplinas do aluno
	private String disciplina;

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Disciplina [disciplina=" + disciplina + ", nota=" + nota + "]";
	}

	public double getMediaNotas(){
		double somaTotal = 0;
		for(int pos = 0; pos < nota.length; pos++){
			somaTotal += nota[pos];
		}
		return somaTotal/nota.length;
	};

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}
}
