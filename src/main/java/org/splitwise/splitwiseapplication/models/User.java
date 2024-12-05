package org.splitwise.splitwiseapplication.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity(name = "user")
@Data
public class User extends BaseModel {
    private String name;
    private String phoneNumber;
    private String password;
}
