package com.example.springMVC.service;

import com.example.springMVC.domain.Knight;
import com.example.springMVC.domain.repository.KnightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class KnightService {
    @Autowired
    KnightRepository knightRepository;
    public List<Knight> getAllKnights(){
       return new ArrayList<>(knightRepository.getAllKnights());
    }
}
