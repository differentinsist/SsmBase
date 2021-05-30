package com.tran.service;

import com.tran.dao.TransferAccountsDao;
import com.tran.pojo.Transaction;

import java.math.BigDecimal;
import java.util.List;

public class TransferAccountsServiceImpl implements TransferAccountsService{

    private TransferAccountsDao accountsDao;

    public void setAccountsDao(TransferAccountsDao accountsDao) {
        this.accountsDao = accountsDao;
    }


    @Override
    public List<Transaction> findAll() {
        return accountsDao.findAll();
    }

    @Override
    public void transfer() {
//    public void transfer(String sourceName, String targetName, Integer money) {
        //根据名字查询转出账户(同时要查询有多少钱吧，其实不用这么多步骤，直接一个sql就可以的对吧？)
        Integer integer1 = accountsDao.queryAccountName("zhangsan");
        //根据名字查询转入账户
        Integer integer2 = accountsDao.queryAccountName("lisi");
        if (integer1 != 1 || integer2 !=1)
            return;
        //转出账户减钱
        Integer newMoney1 = accountsDao.queryMoneyByName("zhangsan") - 100;
        //转入账户加钱
        Integer newMoney2 = accountsDao.queryMoneyByName("lisi") + 100;
        //更新转出账户

        Transaction ts1 = new Transaction();
        ts1.setName("zhangsan");
        ts1.setMomey(newMoney1);
        Transaction ts2 = new Transaction();
        ts1.setName("lisi");
        ts1.setMomey(newMoney2);

        accountsDao.updateMoney(ts1.getName(),ts1.getMomey());
        //更新转入账户
        accountsDao.updateMoney(ts2.getName(),ts2.getMomey());
    }

    @Override
    public Integer queryAccountName(String name) {
        return accountsDao.queryAccountName(name);
    }

    @Override
    public void updateMoney(String name, Integer money) {
        accountsDao.updateMoney(name,money);  //要this吗？？还会代理吗
    }

}
