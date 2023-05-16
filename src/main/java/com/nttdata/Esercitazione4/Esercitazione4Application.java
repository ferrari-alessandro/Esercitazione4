package com.nttdata.Esercitazione4;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.nttdata.Esercitazione4.dao.Person;
import com.nttdata.Esercitazione4.dao.PersonDAO;

@SpringBootApplication
public class Esercitazione4Application implements CommandLineRunner {
	private static final Logger LOG = LoggerFactory.getLogger("Esercitazione4");
	private final PersonDAO personDAL;

	@Autowired
	public Esercitazione4Application(PersonDAO personDAL) {
		this.personDAL = personDAL;
	}

	@Override
	public void run(String... args) {
		List<Person> allPerson = personDAL.getAllPerson();
		for (Person p : allPerson) {
			personDAL.deletePerson(p);
		}
		
		Person person1 = new Person("Martin", Arrays.asList("Startup Guides", "Java"), new Date(664309800000L));
		Person person2 = new Person("David", Arrays.asList("Harry potter", "Success"), new Date(695845800000L));
		Person person3 = new Person("Ivan", Arrays.asList("Secrets of Butene", "Meeting Success"),new Date(569615400000L));
		Person person4 = new Person("Sergey", Arrays.asList("Harry potter", "Startup Guides"), new Date(348777000000L));
		Person person5 = new Person("Shubham", Arrays.asList("Harry potter", "Waking Up"), new Date(769372200000L));
		personDAL.savePerson(person1);
		personDAL.savePerson(person2);
		personDAL.savePerson(person3);
		personDAL.savePerson(person4);
		personDAL.savePerson(person5);
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Esercitazione4Application.class, args).close();
	}
}