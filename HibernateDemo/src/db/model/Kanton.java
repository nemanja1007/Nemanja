package db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="kanton")
public class Kanton {
	
	@Override
	public String toString() {
		return "Kanton: " + kuerzel + ", " + kantonName;
	}

	private String kuerzel;
	private String kantonName;

	public Kanton() {

	}

	public Kanton(String kuerzel, String kantonName) {
		super();
		this.kuerzel = kuerzel;
		this.kantonName = kantonName;
	}

	@Id
	@Column(name="Kuerzel")
	public String getKuerzel() {
		return kuerzel;
	}

	public void setKuerzel(String kuerzel) {
		this.kuerzel = kuerzel;
	}

	@Column(name="Name")
	public String getKantonName() {
		return kantonName;
	}

	public void setKantonName(String kantonName) {
		this.kantonName = kantonName;
	}

}
