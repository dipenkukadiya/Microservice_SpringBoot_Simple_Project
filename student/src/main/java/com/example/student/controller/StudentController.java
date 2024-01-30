package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.service.StudentService;
@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;
   
    @GetMapping("/create")
    public List<Integer> getStudentForColleg(@RequestParam int numStudent ,@RequestParam String branch) {

        return studentService.getStudentForCollege(numStudent, branch);
    }
    
}
