package com.flash.learnflash.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.Data;
@Entity(name = "Word")
@Data
public class Word {

    /**
     * unique id field for word.
     * id must be notnull
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    /**
     * name field for word.
     * name must be notnull
     */
    @Column(name = "name", nullable = false)
    private String name;

}
