package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hospital")
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hospitalId;

	@Column(length = 70, nullable = false)
	private String hospitalName;
	@Column(length = 10, nullable = false)
	private String phoneNo;
	@Embedded
	private Address address;

	@OneToMany(mappedBy = "hId", cascade = CascadeType.ALL)
	private List<Doctor> doctorList = new ArrayList<Doctor>();

	@OneToOne(targetEntity=Login.class) 
	@JoinColumn(name = "login_id")
	private Login loginId;

	public Hospital() {
		System.out.println("In Ctor Of :" + getClass().getName());
	}

	public Hospital(String hospitalName, String phoneNo, Address address) {
		super();
		this.hospitalName = hospitalName;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	
	
	
	
	
	public Hospital( String hospitalName, String phoneNo, Address address,Login l) {
		super();
		
		this.hospitalName = hospitalName;
		this.phoneNo = phoneNo;
		this.address = address;
		loginId=l;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Doctor> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

	public Login getLoginId() {
		return loginId;
	}

	public void setLoginId(Login loginId) {
		this.loginId = loginId;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", phoneNo=" + phoneNo
				+ ", address=" + address + "]";
	}

}
