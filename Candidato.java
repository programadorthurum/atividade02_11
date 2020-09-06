package atividade02_11;

public class Candidato extends Pessoa {

	private int candidatoID;
	private String cargo;
	private String partido;
	private boolean resultado;
	private String uf;
	private Votar votar;

	/**
	 * Construtor padrão
	 */
	public Candidato() {

	}

	public int getCandidatoID() {
		return candidatoID;
	}

	public void setCandidatoID(int candidatoID) {
		this.candidatoID = candidatoID;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Votar getVotar() {
		return votar;
	}

	public void setVotar(Votar votar) {
		this.votar = votar;
	}

	public int candidatura() {
		return candidatoID;

	}

}
