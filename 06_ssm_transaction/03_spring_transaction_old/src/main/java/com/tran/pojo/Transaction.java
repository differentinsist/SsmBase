package com.tran.pojo;

import java.math.BigDecimal;

public class Transaction {
    private Integer id;
    private String name;
//    private BigDecimal momey;
    private Integer momey;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMomey() {
        return momey;
    }

    public void setMomey(Integer momey) {
        this.momey = momey;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", momey=" + momey +
                '}';
    }
}
