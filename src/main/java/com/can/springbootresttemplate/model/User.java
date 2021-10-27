package com.can.springbootresttemplate.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {




    private int id;


    private String firstName;


    private String LastName;


    private String email;


    private LocalDate dateOfBirth;


    private LocalDate createdDate;


    private String phone;


    private Long nationalityId;


}
