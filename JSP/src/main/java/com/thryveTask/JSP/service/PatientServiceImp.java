package com.thryveTask.JSP.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thryveTask.JSP.model.Patient;
import com.thryveTask.JSP.repository.PatientRepository;

import jakarta.annotation.PostConstruct;


@Service
public class PatientServiceImp implements PatientService {

	@Autowired
	PatientRepository patientRepository;
	
	@PostConstruct
	public void initDb() {
		List<Patient> patients = new ArrayList<>();
		patientRepository.saveAll(patients);
		}

	@Override
	public void addPatient(Patient patient) {
		patientRepository.save(patient);
	}

	@Override
	public Optional<Patient> getPatientById(Long patientId) {
	    return patientRepository.findById(patientId);
	}

	
	@Override
	public void updatePatientById(Long patientId, Patient updatedPatient) {
	    Optional<Patient> optionalPatient = patientRepository.findById(patientId);
	    if (optionalPatient.isPresent()) {
	        Patient patientToUpdate = optionalPatient.get();
	        patientToUpdate.setPatientName(updatedPatient.getPatientName());
	        // Update other attributes as needed
	        patientRepository.save(patientToUpdate);
	    } else {
	        // Handle case when the patient with the given ID is not found
	        // You can throw an exception, return an error response, or take appropriate action
	    }
	}

	
	
	@Override
	public List<Patient> getAllPatients(){
		return patientRepository.findAll();
	}

	@Override
	public List<Patient> viewByDeptAdmin(String depAdmin) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void deletePatientById(Long patientId) {
	    patientRepository.deleteById(patientId);
	}


	
}