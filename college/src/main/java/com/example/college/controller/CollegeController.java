package com.example.college.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.college.service.CollegeService;

@RestController
@RequestMapping("college")
public class CollegeController {
   
    @Autowired
    CollegeService collegeService;
    @Autowired
    Environment environment;
   
    // @GetMapping("/{collegeId}")
    // public College getCollege(@PathVariable Long collegeId) {
    //     return collegeService.getCollegeById(collegeId);
    // }
    @PostMapping("/create")
    public String createCollege(@RequestParam int numOfStudent,@RequestParam String branch){
        System.out.println(environment.getProperty("local.server.port"));
       return collegeService.createCollege(numOfStudent,branch);
        
    }
    
}
