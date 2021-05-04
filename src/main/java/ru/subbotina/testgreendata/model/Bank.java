package ru.subbotina.testgreendata.model;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Bank {
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) long id;
    private String name;
    private String BIC;

    public Bank(){}

    public Bank(String name, String BIC){
        this.name = name;
        this.BIC = BIC;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBIC() {
        return BIC;
    }

    public void setBIC(String BIC) {
        this.BIC = BIC;
    }
}
