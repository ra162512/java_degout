package com.entities;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "regCalendar")
public class RegCalendar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rid")
    private Integer rid;
 
    @Column(name = "cid")
    private Integer cid;
 
    @Column(name = "day")
    private String day;
    
    @Column(name = "part")
    private String part;
    
    public Integer getRid() {
        return rid;
    }
 
    public void setRid(Integer rid) {
        this.rid = rid;
    }
    
    public Integer getCid() {
        return cid;
    }
 
    public void setCid(Integer cid) {
        this.cid = cid;
    }
 
    public String getDay() {
        return day;
    }
 
    public void setDay(String day) {
        this.day = day;
    }
    
    public String getPart() {
        return part;
    }
 
    public void setPart(String part) {
        this.part = part;
    }    
}