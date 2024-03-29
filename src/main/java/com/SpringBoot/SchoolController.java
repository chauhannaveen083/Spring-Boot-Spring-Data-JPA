package com.SpringBoot;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
    private SchoolRepository schoolRepository;
    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @GetMapping("/schools")
    public List<School> findAll(){
        return schoolRepository.findAll();
    }
    @PostMapping("/schools")
    public School create(@RequestBody School school){
        return schoolRepository.save(school);
    }

}
