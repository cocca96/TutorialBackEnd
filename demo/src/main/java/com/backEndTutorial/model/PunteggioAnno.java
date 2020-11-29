package com.backEndTutorial.model;

public class PunteggioAnno {
	private int id;

	public PunteggioAnno(int id, int punteggio, int anno) {
		
		this.id = id;
		this.punteggio = punteggio;
		this.anno = anno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int punteggio;
	private int anno;

	public int getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public PunteggioAnno() {

	}

	public PunteggioAnno(int punteggio, int anno) {
		this.punteggio = punteggio;
		this.anno = anno;
	}

}
