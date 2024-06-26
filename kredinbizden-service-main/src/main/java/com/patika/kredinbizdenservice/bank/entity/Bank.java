package com.patika.kredinbizdenservice.bank.entity;

import com.patika.kredinbizdenservice.loan.entity.Loan;
import com.patika.kredinbizdenservice.product.entity.CreditCard;

import java.util.List;

public class Bank {

    private String name;

    private List<Loan> loanList;

    private List<CreditCard> creditCards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(List<Loan> loanList) {
        this.loanList = loanList;
    }

    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", loanList=" + loanList +
                '}';
    }
}
