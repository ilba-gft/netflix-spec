package com.netflix.group2.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotEmpty
    @NotNull
    @Column(name="name")
    private String name;
}
