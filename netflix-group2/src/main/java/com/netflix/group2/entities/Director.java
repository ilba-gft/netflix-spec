package com.netflix.group2.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "director")
public class Director {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotEmpty
    @NotNull
    @Column(name="name")
    private String name;

/*    @ManyToMany(mappedBy = "director")
    Set<Title> title;*/
}
