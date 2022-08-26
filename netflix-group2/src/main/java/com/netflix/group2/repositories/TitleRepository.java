package com.netflix.group2.repositories;

import com.netflix.group2.entities.Actor;
import com.netflix.group2.entities.Title;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitleRepository extends JpaRepository<Title,Integer> {

}
