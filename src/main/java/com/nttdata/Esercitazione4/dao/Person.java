package com.nttdata.Esercitazione4.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.nttdata.Esercitazione4.util.Utility;

@Document(collection = "Users")
public class Person {

	@Id
	private String personId;
	private String name;
	private long age;
	private List<String> favoriteBooks;
	private Date dateOfBirth;

	public Person() {
	}

	public Person(String name, List<String> childrenName, Date dateOfBirth) {

		this.name = name;
		this.favoriteBooks = childrenName;
		this.dateOfBirth = dateOfBirth;
		this.age = Utility.calculateAge(dateOfBirth);
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public List<String> getFavoriteBooks() {
		return favoriteBooks;
	}

	public void setFavoriteBooks(List<String> favoriteBooks) {
		this.favoriteBooks = favoriteBooks;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
