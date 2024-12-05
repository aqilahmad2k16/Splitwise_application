package org.splitwise.splitwiseapplication.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "userExpense")
@Data
public class UserExpense extends BaseModel{
    @ManyToOne
    private User user;

    @ManyToOne
    private Expense expense;

    private int amount;

    @Enumerated(EnumType.ORDINAL)
    private UserExpenseType type;
}
