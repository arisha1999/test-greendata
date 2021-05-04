package ru.subbotina.testgreendata.model;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Client {
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) long id;
    private String name;
    private String nickname;
    private String adress;
    private Integer type;

    public Client(){}

    public Client(String name, String nickname, String adress, Integer type){
        this.name = name;
        this.nickname = nickname;
        this.adress = adress;
        this.type = type;
    }

    public long getId(){ return id; }
    public String getName(){
        return name;
    }
    public String getNickname(){
        return nickname;
    }
    public String getAdress(){
        return adress;
    }
    public Integer getType(){
        return type;
    }

    public void setId(long id){this.id = id;}
    public void setName(String name){this.name=name;}
    public void setNickname(String nickname){this.nickname=nickname;}
    public void setAdress(String adress){this.adress=adress;}
    public void setType(Integer type){this.type=type;}
}
