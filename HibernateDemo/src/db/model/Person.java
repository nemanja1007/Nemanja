package db.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="person")
public class Person {
	private int id;
	private String name;
	private String vorname;
	private LocalDate geburtsdatum;
	private String email;
	private Double gewicht;
	private Kanton kanton;

	public Person() {
	}

	public Person(int id, String name, String vorname, LocalDate geburtsdatum, String email, Double gewicht, Kanton kanton) {
		this.id = id;
		this.name = name;
		this.vorname = vorname;
		this.geburtsdatum = geburtsdatum;
		this.email = email;
		this.gewicht = gewicht;
		this.kanton = kanton;
	}
	
	public Person(String name, String vorname, LocalDate geburtsdatum, String email, Double gewicht, Kanton kanton) {
		this.name = name;
		this.vorname = vorname;
		this.geburtsdatum = geburtsdatum;
		this.email = email;
		this.gewicht = gewicht;
		this.kanton = kanton;
	}

	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy ="increment")
	@Column(name="Id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="Vorname")
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	@Column(name="Geburtsdatum")
	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(LocalDate geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	@Column(name="Email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="Gewicht")
	public Double getGewicht() {
		return gewicht;
	}

	public void setGewicht(Double gewicht) {
		this.gewicht = gewicht;
	}

	@ManyToOne
	@JoinColumn(name="Kanton_FK")
	public Kanton getKanton() {
		return kanton;
	}

	public void setKanton(Kanton kanton) {
		this.kanton = kanton;
	}
	
}
