package service;

import exception.NotEnoughMoneyException;
import exception.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Menu {

    @Autowired
    AccountService fileaccservice;

    public boolean flagexit;

    public  void showactions(){
        System.out.println("��� �� ������ �������? ������� ������� ��� ������!\r\n" +
                " 1: ��� ����� � ������� ������� ����� ����� ������� balance [id] � ������ ���������� � �����\n" +
                " 2: ��� ����� � ������� ������� withdraw [id] [amount] � ����� ��������� �����\n" +
                " 3: ��� ����� � ������� ������� deposite [id] [amount] � ������ �� ���� ��������� �����\n" +
                " 4: ��� ����� � ������� ������� transfer [from] [to] [amount] � ��������� ����� � ������ ����� �� ������\n"+
                " 5: ��� ����� � ������� ������� exit - ����� �� ���������\n");
    }

    public void start(String command) throws NotEnoughMoneyException, UnknownAccountException {
        String [] words = command.split(" ");
        /*� ������ ������� �������� �������� �����, ��������� � �������. ��������:
        ��� ���������� ������� (balance) words[0] - �������, ������� ����� �������, words[1] - ��� id
        ��� ������ ��������� ����� (withdraw) words[0] - �������, ������� ����� �������, words[1] - id, words[2] - �����, ������� ����� �����.
        � �.�. ��� ����������.
         */
        flagexit = false;
        switch (words[0]){
            case "balance":
                System.out.println("�� ����� ��������� �����:");
                fileaccservice.balance(Integer.parseInt(words[1]));
                break;
            case "withdraw":
                System.out.println("����� ��������� �����");
                fileaccservice.withdraw(Integer.parseInt(words[1]), Integer.parseInt(words[2]));
                System.out.println("������ �� ����� ��������� �����:");
                fileaccservice.balance(Integer.parseInt(words[1]));
                break;
            case "transfer":
                System.out.println("��������� ����� � ������ ����� �� ������");
                fileaccservice.transfer(Integer.parseInt(words[1]), Integer.parseInt(words[2]), Integer.parseInt(words[3]));
                System.out.println("������ �� ����� ����������� ��������� �����:");
                fileaccservice.balance(Integer.parseInt(words[1]));
                System.out.println("������ �� ����� ���������� ��������� �����:");
                fileaccservice.balance(Integer.parseInt(words[2]));
                break;
            case "deposite":
                System.out.println("������ �� ���� ��������� �����");
                fileaccservice.deposit(Integer.parseInt(words[1]), Integer.parseInt(words[2]));
                System.out.println("������ �� ����� ��������� �����:");
                fileaccservice.balance(Integer.parseInt(words[1]));
                break;
            case "exit":
                flagexit = true;
                break;
        }
    }
}
