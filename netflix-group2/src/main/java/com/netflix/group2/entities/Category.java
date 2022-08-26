package com.netflix.group2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="category")
public class Category {
	
	@Id
	@Column(name="id", nullable=false)
	private int id;
	
	@NotEmpty
	@Column(name="name", nullable=false)
	private String name;
}
