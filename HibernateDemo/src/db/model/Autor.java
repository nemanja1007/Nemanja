package db.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "autor")
public class Autor {
    private List<Buch> buecher;
    private int id;
    private String vorname;
    private String nachname;

    public Autor() {

    }
    
	public Autor(String vorname, String nachname) {
    	this.vorname = vorname;
        this.nachname = nachname;
    }

    public Autor(int id, List<Buch> buecher,  String vorname, String nachname) {
        super();
        this.buecher = buecher;
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
    }

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "liste", joinColumns = { @JoinColumn(name = "autor_fk") }, inverseJoinColumns = {
	@JoinColumn(name = "buch_fk") })
    public List<Buch> getBuecher() {
        return buecher;
    }

    public void setBuecher(List<Buch> buecher) {
        this.buecher = buecher;
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "vorname")
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Column(name = "nachname")
    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    
    @Override
	public String toString() {
		return "Autor [id=" + id + ", vorname=" + vorname + ", nachname=" + nachname + "]";
	}

}