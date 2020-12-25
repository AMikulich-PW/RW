package exception;

public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException(){
        System.out.println("На выбранном счете недостаточно денег для выполнения операции!");
    }
}