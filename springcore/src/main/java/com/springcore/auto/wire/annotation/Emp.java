package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import com.springcore.auto.wire.Address;

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

		@Autowired
		 
		public void setAddress(Address address) {
			this.address = address;
		}

	

}
