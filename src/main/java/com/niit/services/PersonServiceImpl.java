package com.niit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.PersonDao;
import com.niit.model.Person;
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao personDao;

	  //personServiceImpl.setPersonDao(new PersonDaoImpl());
	public void savePerson(Person person) {
		personDao.savePerson(person);

	}

}
