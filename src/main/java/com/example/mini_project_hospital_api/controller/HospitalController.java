package com.example.mini_project_hospital_api.controller;

import com.example.mini_project_hospital_api.dao.HospitalDao;
import com.example.mini_project_hospital_api.domain.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    private final HospitalDao hospitalDao;

    public HospitalController(HospitalDao hospitalDao){this.hospitalDao=hospitalDao;}

    @GetMapping("/")
    public String hello(){return "Wellcome to Hospital API";}

    @GetMapping("/{id}")
    public String getHospital(@PathVariable("id") String id){
        Hospital hospital = hospitalDao.findeById(Integer.parseInt(id));
        return hospital.toString();
    }
}
