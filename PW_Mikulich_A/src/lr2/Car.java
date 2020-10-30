package lr2;

public abstract class Car {
    public String marka,clas;
    public double wt;
    public Engine motor;
    abstract void start();
    abstract void stop();
    
    public void turnRight(){
        System.out.println("Направо");
    }
    public void turnLeft(){
        System.out.println("Налево");
    }
    abstract void printinfo();
}

