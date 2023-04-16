package com.flash.learnflash.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.Data;

@Entity
@Table(name="tbl_folder")
@Data
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title")
    private Long title;

    @Column(name = "subject_id")
    private Long subjectId;

    @Column(name = "score")
    private Long score;



}
