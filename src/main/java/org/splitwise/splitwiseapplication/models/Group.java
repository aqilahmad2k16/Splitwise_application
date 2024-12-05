package org.splitwise.splitwiseapplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity(name = "userGroup")
@Data
public class Group extends BaseModel{
    private String name;

    @ManyToMany
    private List<User> members;

    @OneToMany(mappedBy = "group")
    private List<Expense> expenses;

    @ManyToOne
    private User createdBy;

    /*
     group => createdBy
     1 => 1
     M <= 1

     M : 1
     */

}


