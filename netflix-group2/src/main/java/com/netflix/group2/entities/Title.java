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
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date_added", nullable = false)
    private String dateAdded;

    @Column(name = "release_year", nullable = false)
    @Min(1900)
    @Max(2022)
    private String releaseYear;

    @Column(name = "rating", nullable = false)
    private String rating;

    @Column(name = "duration", nullable = false)
    private String duration;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "num_Ratings", nullable = false)
    @Min(0)
    private int numRatings;

    @Column(name = "user_rating", nullable = false)
    @Min(0)
    @Max(10)
    private Float userRating;

    @ManyToMany
    @JoinTable(name="title_actor")
    @JsonIgnore
    Set<Actor> actor;



}
