package com.springcore.constructorinjection;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certificate c;
	private List<String> lista;

	/**
	 * @param name
	 * @param personId
	 */
	public Person(String name, int personId, Certificate c, List<String> lista) {
		super();
		this.name = name;
		this.personId = personId;
		this.c = c;
		this.lista = lista;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " : " + this.personId + " : " + this.c.getName() + " : " + this.lista;
	}

}
