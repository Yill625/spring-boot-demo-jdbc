package com.example.demo.lesson.untity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class UserUntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
