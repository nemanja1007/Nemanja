package db.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import db.dao.KantonDAO;
import db.dao.PersonDAO;

public class TestHibernate {
	private EntityManagerFactory entityManagerFactory;

	public static void main(String[] args) {
		TestHibernate test = new TestHibernate();
		//test.testInsert();
		//test.testUpdate();
		//test.testDelete();
		//test.testDeleteKanton();
		//test.testInsertKanton();
		//test.testUpdateKanton();
		test.testSelect();
		test.testSelectAllKanton();

	}
	
	public void testUpdate() {
		Person p = new Person(2, "Testperson", "Geschafft", LocalDate.of(1999, 12, 10), "testmail@test.ch", 69.5, new Kanton("ZH", "Zürich"));
		PersonDAO dao = new PersonDAO();
		dao.update(p);
	}

	
	public void testDelete() {
		PersonDAO dao = new PersonDAO();
		dao.delete(3);
	}
	

	public void testInsert() {
		Person p = new Person("Gian", "Niemann", LocalDate.of(2003, 01, 24), "blabla@test.ch", 50.6, new Kanton("SG", "St. Gallen"));
		PersonDAO dao = new PersonDAO();
		dao.insert(p);
		System.out.println("Die Id ist: " + p.getId());
	}

	public void testSelect() {
		PersonDAO dao = new PersonDAO();
		List<Person> list = dao.selectAll();
		for (Person person : list) {
			System.out.println(person.getName() + ", " + person.getVorname());
			System.out.println(person.getGeburtsdatum());
			System.out.println(person.getEmail());
			System.out.println(person.getGewicht() + "kg");
			System.out.println(person.getKanton());
			System.out.println("-----------------------------------");
		}

	}
	
	public void testSelectAllKanton() {
		KantonDAO kdao = new KantonDAO();
		List<Kanton> list = kdao.selectAllKanton();
		for (Kanton kanton: list) {
			System.out.println(kanton.getKuerzel() + ", " + kanton.getKantonName());
		}
	}
	
	public void testInsertKanton() {
		Kanton k = new Kanton("SG", "St. Gallen");
		KantonDAO kdao = new KantonDAO();
		kdao.insertKanton(k);
	}
	
	public void testDeleteKanton() {
		KantonDAO kdao = new KantonDAO();
		String kuerzel = "TG";
		kdao.deleteKanton(kuerzel);
	}
	
	public void testUpdateKanton() {
		Kanton k = new Kanton("SG", "Sankt Gallen");
		KantonDAO kdao = new KantonDAO();
		kdao.updateKanton(k);
	}

}
