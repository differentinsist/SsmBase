package com.tran.service;

import com.tran.pojo.Transaction;

import java.math.BigDecimal;
import java.util.List;

public interface TransferAccountsService {

    List<Transaction> findAll();

//    void transfer(String sourceName, String targetName, Integer money);
    void transfer();

    //根据名字查询账户
    public Integer queryAccountName(String name);

    //更新账户钱信息
    public void updateMoney(String name, Integer money);
}
