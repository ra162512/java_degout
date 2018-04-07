package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "temCalendar")
public class TemCalendar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tid")
    private Integer tid;
 
    @Column(name = "cid")
    private Integer cid;
 
    @Column(name = "day")
    private String day;
    
    @Column(name = "date")
    private String date;
    
    @Column(name = "part")
    private String part;
    
    public Integer getTid() {
        return tid;
    }
 
    public void setTid(Integer tid) {
        this.tid = tid;
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