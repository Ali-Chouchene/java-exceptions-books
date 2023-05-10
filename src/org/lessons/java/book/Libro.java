package org.lessons.java.book;

public class Libro {
	private String titolo;
	private int numPag;
	private String autore;
	private String editore;

	public Libro(String titolo, int numPag, String autore, String editore) {

		setTitolo(titolo);
		setNumPag(numPag);
		setAutore(autore);
		setEditore(editore);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

}
