package com.example.wilhem.demo.Models;

import org.springframework.jdbc.core.SqlInOutParameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Squid {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer legs;
    private String color;
    private boolean isEdible;
    private boolean venemous;
    private boolean poisonous;
    private String name;
    private double ink;
    private Integer age;

    public Squid(){

    }

    public Squid(Integer legs, String color, boolean isEdible, boolean venemous, boolean poisonous, String name, double ink, Integer age) {
        this.legs = legs;
        this.color = color;
        this.isEdible = isEdible;
        this.venemous = venemous;
        this.poisonous = poisonous;
        this.name = name;
        this.ink = ink;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public void setEdible(boolean edible) {
        this.isEdible = edible;
    }

    public boolean isVenemous() {
        return venemous;
    }

    public void setVenemous(boolean venemous) {
        this.venemous = venemous;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInk() {
        return ink;
    }

    public void setInk(double ink) {
        this.ink = ink;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void celebrateBirthday() {
        this.age++;
    }
}
