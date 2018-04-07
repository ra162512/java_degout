package com.entities;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cid")
    private Integer cid;
 
    @Column(name = "name")
    private String name;
 
    @Column(name = "begDate")
    private String begDate;
    
    @Column(name = "endDate")
    private String endDate;
    
    @Column(name = "type")
    private String type;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "email")
    private String email;
 
    public Integer getCid() {
        return cid;
    }
 
    public void setCid(Integer cid) {
        this.cid = cid;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getBegDate() {
        return begDate;
    }
 
    public void setBegDate(String begDate) {
        this.begDate = begDate;
    }
    
    public String getEndDate() {
        return endDate;
    }
 
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
    
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
}