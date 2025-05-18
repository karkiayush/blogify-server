package com.karkiayush.blogifybackend.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    private UUID id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "useremail", nullable = false,unique = true)
    private String userEmail;
    @Column(name = "userpassword", nullable = false)
    private String userPassword;
    @Column(name = "username", nullable = false)
    private String userImage;
    @Column(name = "username", nullable = false)
    private String userBio;
    @Column(name = "username", nullable = false)
    private String createdAt;
    @Column(name = "username", nullable = false)
    private String updatedAt;
}
