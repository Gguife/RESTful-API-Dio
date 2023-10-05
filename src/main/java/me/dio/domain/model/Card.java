package me.dio.domain.model;

import java.math.BigDecimal;

public class Card {
    
    private Long id;
    private String number;
    private BigDecimal limit;
    
    //Setters
    public void setId(Long id) { this.id = id; }
    public void setNumber(String number) { this.number = number; }
    public void setLimit(BigDecimal limit) { this.limit = limit; }

    ///Getters
    public Long getId(){
        return id;
    }
    public String getNumber(){
        return number;
    }
    public BigDecimal getLimit(){
        return limit;
    }
}
