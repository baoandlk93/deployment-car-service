package com.example.demoheroku.controller;


import com.example.demoheroku.model.entity.car.Gear;
import com.example.demoheroku.model.service.car.IGearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/gear/")
@CrossOrigin("*")
public class GearController {
    @Autowired
    private IGearService service;

    @GetMapping("list")
    public ResponseEntity<List<Gear>> gearList(){
        List<Gear> list = service.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
