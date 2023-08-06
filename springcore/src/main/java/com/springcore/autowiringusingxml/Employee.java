package com.springcore.autowiringusingxml;

public class Employee {
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param address
	 */
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Constructor called");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setter called");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
