package com.springcore.auto.wire;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Epm [address=" + address + "]";
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}

