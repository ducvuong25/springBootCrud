/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuong.repository;

import com.vuong.entity.InterestEntity;
import com.vuong.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ducvuong25
 */
@Repository
public interface InterestRepository extends JpaRepository<InterestEntity, Integer> {

}
