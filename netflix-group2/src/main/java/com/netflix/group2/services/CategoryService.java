package com.netflix.group2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.netflix.group2.entities.Category;
import com.netflix.group2.repositories.CategoryRepository;

public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
}
