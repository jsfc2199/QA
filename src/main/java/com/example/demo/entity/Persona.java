package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Persona {

    private String name;
    private String identification;
    private String phone;
    private String email;
    private float height;
    private int age;

}
