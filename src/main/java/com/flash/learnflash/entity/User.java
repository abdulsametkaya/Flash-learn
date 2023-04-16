package com.flash.learnflash.entity;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.util.Date;

@Entity
@Table(name="tbl_user")
@Data
public class User {


    /**
     * unique id field for word.
     * id must be notnull
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * Uid equals customer email.
     */
    @Column(name = "uid")
    private String uid;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "password")
    private String password;

    @Column(name = "option_email")
    private Boolean optionEmail;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "last_login")
    private Date lastLogin;

    @Column(name = "user_type")
    private String user_type;

    @Column(name = "avatar_link")
    private String avatar_link;


}
