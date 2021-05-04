package ru.subbotina.testgreendata.model;

import javax.persistence.*;

@Entity
public class Deposit {
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) long id;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Bank bank;
    private String date_opened;
    private Double percent;
    private Integer duration;

    public Deposit(){}

    public Deposit(Client client, Bank bank, String date_opened, Double percent, Integer duration){
        this.client = client;
        this.bank = bank;
        this.date_opened = date_opened;
        this.percent = percent;
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDate_opened() {
        return date_opened;
    }

    public void setDate_opened(String date_opened) {
        this.date_opened = date_opened;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
