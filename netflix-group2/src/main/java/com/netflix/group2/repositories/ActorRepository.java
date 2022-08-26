package com.netflix.group2.repositories;

import com.netflix.group2.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor,Integer> {

}
