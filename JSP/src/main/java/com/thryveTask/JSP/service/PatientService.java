package com.thryveTask.JSP.service;

import java.util.List;
import java.util.Optional;

import com.thryveTask.JSP.model.Patient;

public interface PatientService {
	public void addPatient(Patient patient);

	public Optional<Patient> getPatientById(Long patientId);



	public void updatePatientById(Long patientId,Patient patient);
	
	public List<Patient> viewByDeptAdmin(String depAdmin);
	

	public List<Patient> getAllPatients();
	
	public void deletePatientById(Long patientId);

}

