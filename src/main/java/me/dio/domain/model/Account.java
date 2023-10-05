package me.dio.domain.model;

import java.math.BigDecimal;

public class Account {
    
    private Long id;
    private String number;
    private String agency;
    private BigDecimal balance;
    private BigDecimal limit;

    //setters
    public void setId(Long id) { this.id = id; }
    public void setNumber(String number) { this.number = number; }
    public void setAgency(String agency) { this.agency = agency; }
    public void setBalance(BigDecimal balance) { this.balance = balance; }
    public void setLimit(BigDecimal limit) { this.limit = limit; }

    //Getters
    public Long getId(){
        return id;
    }
    public String getNumber(){
        return number;
    }
    public String getAgency(){
        return agency;
    }
    public BigDecimal getBalance(){
        return balance;
    }
    public BigDecimal getLimit(){
        return limit;
    }

}
