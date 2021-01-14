package com.app.pojos;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_id")
	private int patientId;
	@Column(length = 30)
	private String name;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	@Column(length = 10, name = "phone_no")
	private String phone;
	@OneToMany(mappedBy = "pid", cascade = CascadeType.ALL)
	private List<Appointment> appointmentList;
	
	@OneToOne(targetEntity=Login.class) 
	@JoinColumn(name = "login_id")
	private Login loginId;

	public Patient() {
		System.out.println("In Ctor Of :" + getClass().getName());
	}

	public Patient(String name, Gender gender, LocalDate dob, String phone) {
		super();
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.phone = phone;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	public Login getLoginId() {
		return loginId;
	}

	public void setLoginId(Login loginId) {
		this.loginId = loginId;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", phone="
				+ phone + "]";
	}

}
