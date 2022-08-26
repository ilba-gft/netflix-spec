package com.netflix.group2.controllers;

import com.netflix.group2.entities.Title;
import com.netflix.group2.repositories.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
@RestController
public class RecommendController {
    @Autowired
    TitleRepository titleRepository;

}
