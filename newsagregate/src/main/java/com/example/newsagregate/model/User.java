package com.example.newsagregate.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class User {

    private String login;
    private String password;
    private Integer age;
}
