package com.school.sba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.sba.entity.School;

//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.school.sba.entity.School;
@Repository
public interface SchoolRepo extends JpaRepository<School, Integer>{

}
