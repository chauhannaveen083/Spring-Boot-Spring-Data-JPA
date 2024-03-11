package com.SpringBoot;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private final StudentRepository repository;
    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/students")
    public List<Student> findAllStudent()
    {
        return repository.findAll();

    }
    @GetMapping("/students/{student-id}")
    public Student findStudentById(@PathVariable("student-id") Integer id)
    {
        return repository.findById(id).orElse(new Student());
    }


    @PostMapping("/students")
    public Student post(@RequestBody Student student)
    {
        return repository.save(student);
    }

    @GetMapping("/students/search/{student-name}")
    public List<Student> findStudentByName(@PathVariable("student-name") String name)
    {
        return repository.findAllByFirstnameContaining(name);
    }

    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("student-id") Integer id)
    {
        repository.deleteById(id);

    }


}
