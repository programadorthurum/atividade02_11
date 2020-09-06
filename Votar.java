package atividade02_11;

import java.util.Calendar;

public class Votar {

	private int candidatoID;
	private int eleitorID;
	private Calendar data;
	private String cargoCandidato;
	private Eleitor eleitor;
	private Candidato candidato;
	private ServidordeVotos servidodeVotos;

	public ServidordeVotos getServidodeVotos() {
		return servidodeVotos;
	}

	public void setServidodeVotos(ServidordeVotos servidodeVotos) {
		this.servidodeVotos = servidodeVotos;
	}

	public int getCandidatoID() {
		return candidatoID;
	}

	public void setCandidatoID(int candidatoID) {
		this.candidatoID = candidatoID;
	}

	public int getEleitorID() {
		return eleitorID;
	}

	public void setEleitorID(int eleitorID) {
		this.eleitorID = eleitorID;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getCargoCandidato() {
		return cargoCandidato;
	}

	public void setCargoCandidato(String cargoCandidato) {
		this.cargoCandidato = cargoCandidato;
	}

	public Eleitor getEleitor() {
		return eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public void votar() {

	}

	public void cancelar() {

	}
}
