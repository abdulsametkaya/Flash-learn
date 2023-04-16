package com.flash.learnflash.dao;

import com.flash.learnflash.entity.WordSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordSetDao extends JpaRepository<WordSet,Long> {
}
