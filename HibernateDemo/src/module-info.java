module HibernateDemo {
	requires java.persistence;
	requires java.sql;
	requires net.bytebuddy;
	requires com.fasterxml.classmate;
	requires java.xml.bind;
	requires org.hibernate.orm.core;
	opens db.model to org.hibernate.orm.core;
}