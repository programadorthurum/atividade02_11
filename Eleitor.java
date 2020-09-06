package atividade02_11;

import java.util.ArrayList;

public class Eleitor {

	private String endereco;
	private int eleitorId;

	private ZonaEleitoral zonaEleitoral;

	private ArrayList<Votar> votar;

	public ZonaEleitoral getZonaEleitoral() {
		return zonaEleitoral;
	}

	public void setZonaEleitoral(ZonaEleitoral zonaEleitoral) {
		this.zonaEleitoral = zonaEleitoral;
	}

	public ArrayList<Votar> getVotar() {
		return votar;
	}

	public void setVotar(ArrayList<Votar> votar) {
		this.votar = votar;
	}

	public int validar() {
		return 0;

	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getEleitorId() {
		return eleitorId;
	}

	public void setEleitorId(int eleitorId) {
		this.eleitorId = eleitorId;
	}

}
