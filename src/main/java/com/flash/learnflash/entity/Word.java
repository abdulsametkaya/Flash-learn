package com.flash.learnflash.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.Data;

@Entity
@Table(name = "tbl_word")
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

    @Column(name = "front_side_word")
    private String frontSideWord;

    @Column(name = "back_side_word")
    private String backSideWord;

    @Column(name = "source_language")
    private String sourceLanguage;

    @Column(name = "target_language")
    private String targetLanguage;

    @Column(name = "set_id")
    private String setId;

    @Column(name = "score")
    private Long score;

    @Column(name = "word_folder")
    private String wordFolder;

    @Column(name = "user_uid")
    private String userUid;

}

