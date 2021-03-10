/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuong.entity;

import com.vuong.enumutil.Gender;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ducvuong25
 */

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private boolean smoking;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(mappedBy = "userEntity")
    private List<InterestEntity> interestEntityLists = new ArrayList<>();



    public UserEntity() {
    }

    public UserEntity(String name, int age,boolean smoking, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.smoking = smoking;
        this.gender = gender;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
