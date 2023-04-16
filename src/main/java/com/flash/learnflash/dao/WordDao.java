package com.flash.learnflash.dao;

import com.flash.learnflash.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordDao extends JpaRepository<Word,Long> {
}
