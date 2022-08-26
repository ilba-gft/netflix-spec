package com.netflix.group2.entities;

import lombok.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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

    private String dataAdded;

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


}
