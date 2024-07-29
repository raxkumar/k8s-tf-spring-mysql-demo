package com.example.kubernetes;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "\"User\"")
@NoArgsConstructor
@ToString
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
}
