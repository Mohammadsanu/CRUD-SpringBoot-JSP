package com.thryveTask.JSP.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.thryveTask.JSP.model.Patient;
import com.thryveTask.JSP.service.PatientServiceImp;


@RestController
public class PatientController {

    @Autowired
    PatientServiceImp patientServiceImp;

    @GetMapping("/")
    public ModelAndView welcome() {
        return new ModelAndView("welcome");
    }

    @GetMapping("/addPatientPage")
    public ModelAndView addPatientPage() {
        return new ModelAndView("addPatient");
    }

    @PostMapping("/addPatient")
    public ModelAndView addPatient(@ModelAttribute("patient") Patient patient) {
        patientServiceImp.addPatient(patient);
        return new ModelAndView("redirect:/patients");
    }

    @GetMapping("/updatePatientPage")
    public ModelAndView updatePatientPage(@RequestParam("patientId") Long patientId, Model model) {
        Optional<Patient> patient = patientServiceImp.getPatientById(patientId);
        ModelAndView modelAndView = new ModelAndView("updatePatient");
        modelAndView.addObject("patient", patient.orElse(new Patient()));
        modelAndView.addObject("patientId", patientId);
        return modelAndView;
    }

    
    @PostMapping("/updatePatient")
    public String updatePatient(HttpServletRequest request) {
        Long patientId = Long.parseLong(request.getParameter("patientId"));
        Optional<Patient> existingPatient = patientServiceImp.getPatientById(patientId);
        if (existingPatient.isPresent()) {
            Patient patient = existingPatient.get();
            patient.setPatientName(request.getParameter("patientName"));
            // Update other attributes as needed

            // Pass both the patient ID and the updated patient object to the service method
            patientServiceImp.updatePatientById(patientId, patient);
            return "redirect:/patients";
        } else {
            // Handle case when the patient with the given ID is not found
            // You can throw an exception, return an error response, or take appropriate action
            return "error"; // Modify this line as per your error handling logic
        }
    }








    @GetMapping("/deletePatientPage")
    public ModelAndView deletePatientPage() {
        return new ModelAndView("deletePatient");
    }

    @DeleteMapping("/deletePatient/{patientId}")
    public void deletePatientById(@PathVariable Long patientId) {
        patientServiceImp.deletePatientById(patientId);
    }

    @GetMapping("/patients")
    public ModelAndView getAllPatients(Model model) {
        List<Patient> patients = patientServiceImp.getAllPatients();
        model.addAttribute("patients", patients);
        return new ModelAndView("patient");
    }
}
