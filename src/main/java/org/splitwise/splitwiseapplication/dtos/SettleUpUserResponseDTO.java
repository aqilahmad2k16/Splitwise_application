package org.splitwise.splitwiseapplication.dtos;

import org.splitwise.splitwiseapplication.models.Expense;

import java.util.List;

public class SettleUpUserResponseDTO {
    private ResponseType responseType;
    private List<Expense> expenses;
}
