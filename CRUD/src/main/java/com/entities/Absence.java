package com.entities;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "absence")
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aid")
    private Integer aid;
    
    @Column(name = "name")
    private String name;
 
    @Column(name = "day")
    private String day;
    
    @Column(name = "date")
    private String date;
    
    @Column(name = "part")
    private String part;
    
    @Column(name = "content")
    private String content;
    
    public Integer getAid() {
        return aid;
    }
 
    public void setAid(Integer aid) {
        this.aid = aid;
    }
    
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }   
 
    public String getDay() {
        return day;
    }
 
    public void setDay(String day) {
        this.day = day;
    }
    
    public String getDate() {
        return date;
    }
 
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getPart() {
        return part;
    }
 
    public void setPart(String part) {
        this.part = part;
    }  
    
    public String getContent() {
        return content;
    }
 
    public void setContent(String content) {
        this.content = content;
    }   
}