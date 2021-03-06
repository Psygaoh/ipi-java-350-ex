package com.ipiecoles.java.java350.controller;

import com.ipiecoles.java.java350.model.Employe;
import com.ipiecoles.java.java350.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employe")
public class Test {

    @Autowired
    private EmployeRepository employeRepository;

    public Employe getEmploye(@PathVariable("id") Long id){
        return employeRepository.findById(id).get();
    }
}
