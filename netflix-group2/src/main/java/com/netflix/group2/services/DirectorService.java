package com.netflix.group2.services;

import com.netflix.group2.entities.Director;
import com.netflix.group2.repositories.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {
    @Autowired
    private DirectorRepository directorRepository;

    public List<Director> findAll(){
        return directorRepository.findAll();
    }

}
