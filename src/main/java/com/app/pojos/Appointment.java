package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "appointment")
public class Appointment {
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointmentId;
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient pid;
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor docId;
	@Column(length = 150)
	private String description;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate appointmentDate;
	private int status;

	public Appointment() {
		System.out.println("In Ctor Of :" + getClass().getName());
	}

	public Appointment(String description, LocalDate appointmentDate, int status) {
		super();
		this.description = description;
		this.appointmentDate = appointmentDate;
		this.status = status;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Patient getPid() {
		return pid;
	}

	public void setPid(Patient pid) {
		this.pid = pid;
	}

	public Doctor getDocId() {
		return docId;
	}

	public void setDocId(Doctor docId) {
		this.docId = docId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", description=" + description + ", appointmentDate="
				+ appointmentDate + ", status=" + status + "]";
	}

}
