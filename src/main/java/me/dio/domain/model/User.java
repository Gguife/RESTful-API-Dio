package me.dio.domain.model;

import java.util.List;

public class User {
    
    private Long id;
    private String name;
    private Account account;
    private Card card;
    private List<Feature> features;
    private List<News> news;

    //Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAccount(Account account) { this.account = account; }
    public void setCard(Card card) { this.card = card; }
    public void setFeature(List<Feature> features) { this.features = features; }
    public void setNews(List<News> news) { this.news = news; }

    //Getters
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Account getAccount(){
        return account;
    }
    public Card getCard(){
        return card;
    }
    public List<Feature> getFeatures(){
        return features;
    }
    public List<News> getNews(){
        return news;
    }

}
