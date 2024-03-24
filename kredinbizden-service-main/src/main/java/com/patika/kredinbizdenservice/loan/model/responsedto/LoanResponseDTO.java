package com.patika.kredinbizdenservice.loan.model.responsedto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class LoanResponseDTO {
    BigDecimal amount;
    Integer installment;
    String bank;
    Double interestRate;
}
