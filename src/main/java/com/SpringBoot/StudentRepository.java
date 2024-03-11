package com.SpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    //user defined method field name should be same
    //if you want all fields that method name should start with findAll or if you want single data then findBy
    List<Student> findAllByFirstnameContaining(String firstname);
    void deleteByFirstnameContaining(String firstname);
}
