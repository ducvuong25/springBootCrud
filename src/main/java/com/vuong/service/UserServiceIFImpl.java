/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuong.service;

import com.vuong.entity.UserEntity;
import com.vuong.enumutil.Gender;
import com.vuong.repository.UserRepository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author ducvuong25
 */
@Service
public class UserServiceIFImpl implements UserServiceIF {

    @Autowired
    private UserRepository userRepository;

//    @Override
//    @PostConstruct
//    public void initDate() {
//        UserEntity nguyen_hai_phong = new UserEntity("Nguyen hai phong", 18,true, Gender.MALE);
//        UserEntity dam_vinh_hung = new UserEntity("dam vinh hung", 33,true, Gender.FEMALE);
//        UserEntity ho_ngoc_ha = new UserEntity("Ho ngoc ha", 44,false, Gender.FEMALE);
//        UserEntity quang_le = new UserEntity("Quang le", 33, false,Gender.MALE);
//        userRepository.saveAll(Arrays.asList(nguyen_hai_phong, dam_vinh_hung, ho_ngoc_ha, quang_le));
//
//    }

    @Override
    public void addUser(UserEntity user) {
        userRepository.save(user);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void removeUser(int id) {
        userRepository.deleteById(id);
    }

}
