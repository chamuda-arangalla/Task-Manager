package com.example.task_manager.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Users")
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private String contact;

}
