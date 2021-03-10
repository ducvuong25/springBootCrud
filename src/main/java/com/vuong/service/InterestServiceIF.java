/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuong.service;

import com.vuong.entity.UserEntity;

import java.util.List;

/**
 *
 * @author ducvuong25
 */
public interface InterestServiceIF {

//
//    void initDate();

    void addUser(UserEntity user);

    List<UserEntity> getAllUsers();

    UserEntity getUser(int id);

    void removeUser(int id);
}
