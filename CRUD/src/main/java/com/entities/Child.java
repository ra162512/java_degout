package com.entities;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "child")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chid")
    private Integer chid;
 
    @Column(name = "name")
    private String name;
 
    @Column(name = "birth")
    private String birth;
 
    public Integer getChid() {
        return chid;
    }
 
    public void setChid(Integer chid) {
        this.chid = chid;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getBirth() {
        return birth;
    }
 
    public void setBirth(String birth) {
        this.birth = birth;
    }
}