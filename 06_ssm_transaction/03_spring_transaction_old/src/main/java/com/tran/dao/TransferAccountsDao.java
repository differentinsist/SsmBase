package com.tran.dao;

import com.tran.pojo.Transaction;

import java.math.BigDecimal;
import java.util.List;

public interface TransferAccountsDao {

    List<Transaction> findAll();


    //转钱
//    void transfer(String sourceName, String targetName, Integer money);
    void transfer();

    //根据名字查询账户
    public Integer queryAccountName(String name);

    //更新账户钱信息
    public void updateMoney(String name, Integer money);

    //根据名字查钱
    public Integer queryMoneyByName(String name);

}
