package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(length = 30)
	private String area;
	@Column(length = 30)
	private String city;
	@Column(length = 30)
	private String state;
	@Column(length = 6, name = "pin_code")
	private int pinCode;

	public Address() {
		System.out.println("In Ctor Of :" + getClass().getName());
	}

	public Address(String area, String city, String state, int pinCode) {
		super();
		this.area = area;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}

	
}
