package com.flash.learnflash.dao;

import com.flash.learnflash.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderDao extends JpaRepository<Folder,Long> {
}
