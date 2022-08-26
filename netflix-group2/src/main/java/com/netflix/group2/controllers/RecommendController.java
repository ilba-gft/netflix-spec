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
    private TitleRepository titleRepository;


    @GetMapping("api/recommend/best")
    public ResponseEntity<List<Title>> getTopTen(@RequestParam(name = "top", required = false, defaultValue = "10") Integer top){
        Comparator<Title> comparator = Comparator.comparing(Title::getRating);
        return new ResponseEntity(titleRepository.findAll().stream()
                .sorted(comparator.reversed())
                .limit(top)
                .toList(), new HttpHeaders(), HttpStatus.OK);
    }
}
