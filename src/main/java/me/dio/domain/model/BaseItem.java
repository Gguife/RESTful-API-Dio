package me.dio.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon; 
    private String description;
    
    //Setters
    public void setId(Long id) { this.id = id; }
    public void setIcon(String icon) { this.icon = icon; }
    public void setDescription(String description) { this.description = description; }

    ///Getters
    public Long getId(){
        return id;
    }
    public String getIcon(){
        return icon;
    }
    public String getDescription(){
        return description;
    }

}
