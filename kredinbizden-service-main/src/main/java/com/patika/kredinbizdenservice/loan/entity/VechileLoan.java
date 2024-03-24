package com.patika.kredinbizdenservice.loan.entity;

import com.patika.kredinbizdenservice.loan.entity.enums.LoanType;
import com.patika.kredinbizdenservice.loan.entity.enums.VechileStatusType;

import java.math.BigDecimal;

public class VechileLoan extends Loan {

    private LoanType loanType = LoanType.ARAC_KREDISI;
    private VechileStatusType vechileStatusType;

    public VechileLoan() {

    }

    public VechileLoan(BigDecimal amount, Integer installment, Double interestRate) {
        super(amount, installment, interestRate);
    }

    @Override
    protected void calculate(BigDecimal amount, int installment) {

    }

    public LoanType getLoanType() {
        return loanType;
    }


}
