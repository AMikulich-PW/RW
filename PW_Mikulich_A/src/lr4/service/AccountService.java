package service;

import exception.NotEnoughMoneyException;
import exception.UnknownAccountException;

public interface AccountService {

    void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException;
    void balance(int accountId) throws UnknownAccountException;
    void deposit(int accountId, int amount) throws UnknownAccountException;
    void transfer(int accountFrom, int accountTo, int amount) throws NotEnoughMoneyException, UnknownAccountException;

}