package com.example.springMVC.domain;

import java.util.Objects;

public class Knight {

    private String name;
    private int age;
    private Quest quest;

    public Knight() {
    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int hashCode(){
        return Objects.hash(age);
    }
    public void setQuest(Quest quest){
        System.out.println("Ustawiam zadanie dla rycerza");
        this.quest = quest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu " + name + " wieku " + age + " ma zadanie " + quest;
    }
}
