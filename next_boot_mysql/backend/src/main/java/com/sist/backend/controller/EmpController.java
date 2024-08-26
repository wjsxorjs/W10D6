package com.sist.backend.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sist.backend.service.EmpService;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class EmpController {
    
    @Autowired
    private EmpService e_service;

    @RequestMapping("/all")
    public Map<String, Object> all() {
        Map<String, Object> e_map = new HashMap<>();

        e_map.put("e_list", e_service.getAll());

        return e_map;
    }
    


}
