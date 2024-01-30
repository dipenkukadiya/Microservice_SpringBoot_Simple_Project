package com.example.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.repository.StudentRepository;
import com.example.student.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Integer> getStudentForCollege(int numStudent ,String branch) {
     List<Integer> student = studentRepository.findRandomIdsBybranch(numStudent,branch);
     return student;
    }

  
    
}
