package me.dio.domain.model;

public class Feature {
    
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
