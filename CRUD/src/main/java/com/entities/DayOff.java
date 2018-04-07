package com.entities;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "dayOff")
public class DayOff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "did")
    private Integer did;
 
    @Column(name = "day")
    private String day;
    
    @Column(name = "date")
    private String date;
    
    @Column(name = "part")
    private String part;
    
    public Integer getDid() {
        return did;
    }
 
    public void setDid(Integer did) {
        this.did = did;
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
}