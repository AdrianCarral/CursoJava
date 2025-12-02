package Practica7.controller;

import Practica7.model.Student;
import Practica7.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // viene en la dependencia WEB (spring-boot-starter-web) del pom
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService service;

    @GetMapping("/")  //http://localhost:8080/students/
    public String home() {
        return "Estas en el servicio de estudiantes";
    }

    @GetMapping("/listado")
    public List<Student> listStudents(){
        return service.allStudent();
    }

    @GetMapping(path="id/{id}")
    public Student getStudentById(@PathVariable Long id){
        return service.getStudent(id).orElse(null);
    }

    @PostMapping()
    public Student addStudent(@RequestBody Student s){
        return service.createStudent(s);
    }

    @PutMapping(path="/{id}")
    public Student put(@PathVariable long id,@RequestBody Student s){
        return service.modifyStudent(id, s);
    }
    @DeleteMapping(path="/delete/{id}")
    public void delete(@PathVariable long id) {
        service.deleteStudent(id);
    }

}
