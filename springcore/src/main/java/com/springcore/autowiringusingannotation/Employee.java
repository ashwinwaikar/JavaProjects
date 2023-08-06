package com.springcore.autowiringusingannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("address1")
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Constructor called");
	}

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setter called");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
