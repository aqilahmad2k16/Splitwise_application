package org.splitwise.splitwiseapplication.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity(name = "expense")
@Data
public class Expense extends BaseModel{
    private String description;
    private int amount;

    @ManyToOne
    private User createdBy;

    @OneToMany(mappedBy = "expense")
    private List<UserExpense> userExpenseList;

    @ManyToOne
    private Group group;

    @Enumerated(EnumType.ORDINAL)
    private ExpenseType expenseType;
}
