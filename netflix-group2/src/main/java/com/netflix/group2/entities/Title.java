package com.netflix.group2.entities;

import lombok.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "title")
public class Title {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @NotEmpty
    @NotNull
    private String name;
    @Column(name = "date_added", nullable = false)
    private String dateAdded;

    @Min(1900)
    @Max(2022)
    private String releaseYear;

    private String rating;

    private String duration;

    private String description;

    @Min(0)
    private int numRatings;
    @Min(0)
    @Max(10)
    private Float userRating;

    @ManyToMany
    @JoinTable(name="title_actor")
    @JsonIgnore
    Set<Actor> actor;

    @ManyToMany
    @JoinTable(name="title_director")
    @JsonIgnore
    Set<Director> director;

    @ManyToMany
    @JoinTable(name="title_category")
    @JsonIgnore
    Set<Category> category;


}
