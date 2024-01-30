package com.example.college.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("STUDENTSERVICE")
public interface CollegeInterface {
   
    @GetMapping("student/create")
    public ResponseEntity<List<Integer>> getStudentForColleg(@RequestParam int  numStudent ,@RequestParam String branch) ;
}
