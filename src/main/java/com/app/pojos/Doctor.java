package com.app.pojos;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "doctor")
public class Doctor {

	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;
	@Column(length = 30)
	private String doctorName;
	@Enumerated(EnumType.STRING)
	private Speciality specialization;

	private int experience;
	@Column(length = 50)
	private String education;

	@ManyToOne
	@JoinColumn(name = "hospital_id")
	private Hospital hId;

	
	@OneToOne(targetEntity=Login.class) 
	@JoinColumn(name = "login_id")
	private Login loginId;
	@OneToMany(mappedBy = "docId", cascade = CascadeType.ALL)
	private List<Appointment> appointmentList;

	public Doctor() {
		System.out.println("In Ctor Of :" + getClass().getName());

	}

	public Doctor(String doctorName, Speciality specialization, int experience, String education) {
		super();
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.experience = experience;
		this.education = education;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Speciality getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Speciality specialization) {
		this.specialization = specialization;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Hospital gethId() {
		return hId;
	}

	public void sethId(Hospital hId) {
		this.hId = hId;
	}

	public Login getLoginId() {
		return loginId;
	}

	public void setLoginId(Login loginId) {
		this.loginId = loginId;
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", experience=" + experience + ", education=" + education + "]";
	}

}
