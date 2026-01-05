
package com.noeliaporta.peoplemanager;

import com.noeliaporta.peoplemanager.model.Person;

public class Main {

	public static void main(String[] args) {

		Person person = new Person(1, "Noelia Porta", 21, "noelia@email.com");

		System.out.println("Person created:");
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Email: " + person.getEmail());
	}
}
