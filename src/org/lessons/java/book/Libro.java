package org.lessons.java.book;

public class Libro {
	private String titolo;
	private int numPag;
	private String autore;
	private String editore;

	public Libro(String titolo, int numPag, String autore, String editore) throws Exception {

		setTitolo(titolo);
		setNumPag(numPag);
		setAutore(autore);
		setEditore(editore);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) throws Exception {

		if (titolo.length() <= 0) {

			throw new Exception("Non hai inserito il titolo del libro!");
		}
		this.titolo = titolo;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) throws Exception {
		if (numPag <= 0) {

			throw new Exception("Il numero delle pagine non può essere di 0 o inferiore!");
		}
		this.numPag = numPag;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws Exception {
		if (autore.length() <= 0) {

			throw new Exception("Non hai inserito l'autore!");
		}
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	@Override
	public String toString() {

		return "**Titolo: " + getTitolo() + "   " + "**Autore: " + getAutore() + " " + "**Editore: " + getEditore()
				+ " " + "**Pagine: " + getNumPag();
	}
}
