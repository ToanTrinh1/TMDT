package com.example.tmdt_project.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "User_01")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @Column(name = "Full_name")
    private String fullName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Phone")
    private Integer phone;
    @Column(name = "Addres")
    private String addres;
    @Column(name = "User_name")
    private String userName;
    @Column(name = "Password")
    private String password;
    @Column(name = "Role")
    private Integer Role;

}
