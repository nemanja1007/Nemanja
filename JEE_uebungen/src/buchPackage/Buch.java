package buchPackage;

public class Buch {
	private String titel;
	private int seiten;
	private String kategorie;
	private int isbn;
	private Author author;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getSeiten() {
		return seiten;
	}

	public void setSeiten(int seiten) {
		this.seiten = seiten;
	}

	public String getKategorie() {
		return kategorie;
	}

	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}

}
