package com.thryveTask.JSP.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.thryveTask.JSP.model.Patient;


public interface PatientRepository extends JpaRepositoryImplementation<Patient, Long> {
//	public List <Patient> findByDate(String registrationDate);
}
