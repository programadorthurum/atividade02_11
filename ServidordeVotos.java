package atividade02_11;

import java.util.ArrayList;
import java.util.Calendar;

public class ServidordeVotos {

	private int candidatoID;
	private int eleitorID;
	private Calendar data;
	private int contaVotos;

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

	public int getContaVotos() {
		return contaVotos;
	}

	public void setContaVotos(int contaVotos) {
		this.contaVotos = contaVotos;
	}

	public ArrayList<Votar> getVotar() {
		return votar;
	}

	public void setVotar(ArrayList<Votar> votar) {
		this.votar = votar;
	}

	private ArrayList<Votar> votar;

	public ServidordeVotos() {
		votar = new ArrayList<Votar>();
	}

	public int contaVotos() {
		return 0;

	}
}
