package com.netflix.group2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netflix.group2.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
