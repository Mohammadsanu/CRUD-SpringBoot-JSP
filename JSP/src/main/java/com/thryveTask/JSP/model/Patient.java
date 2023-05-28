package com.thryveTask.JSP.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "PatientTable")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long patientId; // Primary key
	private String patientName;
	private String gender;
	private String dob;
	private Long mobileNo;
	private String address;
	private String insurance;
	private String disease;
	private String depAdmin;
	private String date;

	public Patient() {

	}

	public Patient(Long patientId, String patientName, String gender, String dob, Long mobileNo, String address,
			String insurance, String disease, String depAdmin, String registrationDate) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.gender = gender;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.address = address;
		this.insurance = insurance;
		this.disease = disease;
		this.depAdmin = depAdmin;
		this.date = date;
	}

	// Getter & setter
	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getDepAdmin() {
		return depAdmin;
	}

	public void setDepAdmin(String depAdmin) {
		this.depAdmin = depAdmin;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}

