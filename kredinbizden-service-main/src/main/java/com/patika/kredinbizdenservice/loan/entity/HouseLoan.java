package com.patika.kredinbizdenservice.loan.entity;



import com.patika.kredinbizdenservice.loan.entity.enums.LoanType;

import java.math.BigDecimal;

public class HouseLoan extends Loan {

    private LoanType loanType = LoanType.KONUT_KREDISI;

    public HouseLoan() {

    }

    public HouseLoan(BigDecimal amount, Integer installment, Double interestRate) {
        super(amount, installment, interestRate);
    }

    @Override
    protected void calculate(BigDecimal amount, int installment) {

    }

    public LoanType getLoanType() {
        return loanType;
    }

}
