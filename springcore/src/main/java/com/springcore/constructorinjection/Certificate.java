package com.springcore.constructorinjection;

public class Certificate {
	private String name;

	/**
	 * @param name
	 */
	public Certificate(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
