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
@Table(name = "User_02")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Full_name", columnDefinition = "nvarchar(255)")
    private String fullname;
    @Column(name = "Email", columnDefinition = "nvarchar(255)")
    private String email;
    @Column(name = "Phone" , columnDefinition = "nvarchar(255)")
    private Integer phone;
    @Column(name = "Addres" , columnDefinition = "nvarchar(255)")
    private String addres;
    @Column(name = "User_name", columnDefinition = "nvarchar(255)")
    private String username;
    @Column(name = "Password", columnDefinition = "nvarchar(255)")
    private String password;
    @Column(name = "Role")
    private Integer Role;

}
