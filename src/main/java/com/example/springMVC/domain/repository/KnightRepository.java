package com.example.springMVC.domain.repository;
import com.example.springMVC.domain.Knight;

import java.util.Collection;

public interface KnightRepository {

    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Knight getKnight(String name);

    void deleteKnight(String name);

    void build();
}
