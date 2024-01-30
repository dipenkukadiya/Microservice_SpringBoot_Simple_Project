package com.example.college.service.impl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.college.entity.College;
import com.example.college.feign.CollegeInterface;
import com.example.college.repository.CollegeRepository;
import com.example.college.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService {
    @Autowired
    CollegeRepository collegeRepository;
    @Autowired
    CollegeInterface collegeInterface;

    // @Override
    // public College getCollegeById(Long collegeId) {
    // return collegeRepository.findById(collegeId).get();

    // }

    @Override
    public String createCollege(int numOfStudent, String branch) {

        List<Integer> student = collegeInterface.getStudentForColleg(numOfStudent, branch).getBody();
        College college = new College();
        college.setStudentIds(student);
        collegeRepository.save(college);
        return "ok";
}}