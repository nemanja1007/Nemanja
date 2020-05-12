package db.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "buch")
public class Buch {
    private List<Autor> autoren;
    private int isbn;
    private String titel;

    public Buch() {

    }



    public Buch(String titel) {
        this.titel = titel;
    }

    public Buch(List<Autor> autoren, int isbn, String titel) {
        super();
        this.autoren = autoren;
        this.isbn = isbn;
        this.titel = titel;
    }

    @ManyToMany(mappedBy = "buecher")
    public List<Autor> getAutoren() {
        return autoren;
    }

    public void setAutoren(List<Autor> autoren) {
        this.autoren = autoren;
    }

    @Id
    @Column(name = "isbn")
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Column(name = "titel")
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    @Override
    public String toString() {
        return "Buch [isbn=" + isbn + ", titel=" + titel + "]";
    }

}