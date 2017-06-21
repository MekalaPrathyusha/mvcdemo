package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Person;
@Repository
public class PersonDaoImpl implements PersonDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void savePerson(Person person){
		Session session=sessionFactory.openSession();
		session.save(person);
		session.flush();
		session.close();
		
		
	}

}
