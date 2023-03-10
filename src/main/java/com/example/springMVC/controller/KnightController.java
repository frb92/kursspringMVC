package com.example.springMVC.controller;

import com.example.springMVC.domain.Knight;
import com.example.springMVC.service.KnightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class KnightController {


    @Autowired
    KnightService service;
    @RequestMapping("/knights")
    public String getKnights(Model model){
        List<Knight> allKnights =  service.getAllKnights();
        model.addAttribute("knights", allKnights);
        model.addAttribute("hello", "Witaj świecie");
        return "knights";
    }
}
