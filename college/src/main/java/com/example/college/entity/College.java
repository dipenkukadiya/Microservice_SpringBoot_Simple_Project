package com.example.college.entity;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

@Data
@Entity
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long collegeId;

    private String collegeName;
   
    @ElementCollection
    private List<Integer> studentIds; 

}
