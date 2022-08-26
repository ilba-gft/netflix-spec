package com.netflix.group2.repositories;

import com.netflix.group2.entities.Actor;
import com.netflix.group2.entities.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director,Integer> {

}
