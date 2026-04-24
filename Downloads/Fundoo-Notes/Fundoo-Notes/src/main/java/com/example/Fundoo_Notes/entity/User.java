package com.example.Fundoo_Notes.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class User {

    @Id
    @Generated(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;

    @Column(value=true)
    private String email;

    private String password;
}