package org.lessons.java.book;

import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	private static final String FILENAME = "C:\\test\\test.txt";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quanti libri vuoi inserire?");
		int bookN = input.nextInt();
		Libro[] books = new Libro[bookN];
		for (int i = 0; i < bookN; i++) {
			System.out.println("Inserici Titolo (" + i + ")");
			String titolo = input.next();
			System.out.println("Inserici Numero pagine (" + i + ")");
			int numPag = input.nextInt();
			System.out.println("Inserici Autore (" + i + ")");
			String autore = input.next();
			System.out.println("Inserici Editore (" + i + ")");
			String editore = input.next();

			try {
				Libro book = new Libro(titolo, numPag, autore, editore);
				books[i] = book;
			} catch (Exception e) {

				e.printStackTrace();
			}

		}
		input.close();

		printBooks(books);

	}

	public static void printBooks(Libro[] books) {
		try {
			FileWriter writer = new FileWriter(FILENAME);
			for (int i = 0; i < books.length; i++) {
				Libro book = books[i];
				writer.write(book.toString()
						+ "-----------------------------------------------------------------------------------------------------------------");

			}
			writer.close();
		} catch (Exception e) {

			System.err.println("Errore nella creazione di Libro" + e.getMessage());
		}
	}
}
