package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {

	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loginId;
	@Column(length = 30, unique = true, nullable = false)
	private String loginEmail;
	@Column(length = 30, nullable = false)
	private String password;
	@Enumerated(EnumType.STRING)
	private Role type;

	public Login() {
		System.out.println("In Ctor Of :" + getClass().getName());
	}

	public Login(String loginEmail, String password, Role type) {
		super();
		this.loginEmail = loginEmail;
		this.password = password;
		this.type = type;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getType() {
		return type;
	}

	public void setType(Role type) {
		this.type = type;
	}

	/*
	 * public Hospital getCurrentHospital() { return currentHospital; }
	 * 
	 * public void setCurrentHospital(Hospital currentHospital) {
	 * this.currentHospital = currentHospital; }
	 * 
	 * public Doctor getCurrentDoctor() { return currentDoctor; }
	 * 
	 * public void setCurrentDoctor(Doctor currentDoctor) { this.currentDoctor =
	 * currentDoctor; }
	 * 
	 * public Patient getCurrentPatient() { return currentPatient; }
	 * 
	 * public void setCurrentPatient(Patient currentPatient) { this.currentPatient =
	 * currentPatient; }
	 */
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", loginEmail=" + loginEmail + ", password=" + password + ", type=" + type
				+ "]";
	}

}



//----------------------------------------------------




//require uni one to one mapping 
//	@OneToOne(mappedBy = "loginId", cascade = CascadeType.ALL)
//	private Hospital currentHospital;
//	@OneToOne(mappedBy = "loginId", cascade = CascadeType.ALL)
//	private Doctor currentDoctor;
//	@OneToOne(mappedBy = "loginId", cascade = CascadeType.ALL)
//	private Patient currentPatient;

