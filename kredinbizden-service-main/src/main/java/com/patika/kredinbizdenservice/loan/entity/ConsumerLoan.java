package com.patika.kredinbizdenservice.loan.entity;


import com.patika.kredinbizdenservice.loan.entity.enums.LoanType;

import java.math.BigDecimal;
import java.util.List;

public class ConsumerLoan extends Loan {

    private LoanType loanType = LoanType.IHTIYAC_KREDISI;
    private List<Integer> installmentOptions;

    public ConsumerLoan() {

    }

    public ConsumerLoan(BigDecimal amount, Integer installment, Double interestRate) {
        super(amount, installment, interestRate);
    }

    @Override
    protected void calculate(BigDecimal amount, int installment) {

    }

    public LoanType getLoanType() {
        return loanType;
    }



}
