package com.example.newsagregate.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class FormUsers {

    private String login;
    private String password;
    private Integer age;
}
