package com.example.monolithic_spring_security.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

@Table(name = "user_details")
public class AuthUser {
    @Id
    @Column(name = "cred_Id")
    private int authUserId;

    @Column(name = "cred_username")
    private String authUsername;

    @Column(name = "cred_password")
    private String authPassword;

    @ManyToMany
    @JoinTable(name = "credential_role", joinColumns = @JoinColumn(name = "cred_Id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    List<Roles> allRoles;

}
