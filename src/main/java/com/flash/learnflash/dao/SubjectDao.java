package com.flash.learnflash.dao;

import com.flash.learnflash.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectDao extends JpaRepository<Subject,Long> {
}
