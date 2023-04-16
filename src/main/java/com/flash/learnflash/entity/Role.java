package com.flash.learnflash.entity;


import com.flash.learnflash.entity.enums.RoleType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Table(name="tbl_role")
@Data
public class Role {

    /**
     * unique id field for word.
     * id must be notnull
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull(message="Please provide role")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleType name;

}
