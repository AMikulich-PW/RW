package lr2;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone(int a, String b, double c) {
        this(a,b);
        weight = c;
    }
    public Phone(int a, String b) {
        number = a;
        model = b;
    }
    public Phone()
    {

    }
    public  int getNumber()
    {
        return number;
    }
    public  String getModel()
    {
        return model;
    }
    public  double getWeight()
    {
        return weight;
    }
    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name,int number)
    {
        System.out.println("Звонит " + name + ". Его номер: " + number);
    }
    public void SendMessag(int ... num)
    {
        for (int i : num) {
            System.out.println("Номер " + i);
        }
    }
    public static void main(String[] args) {
        Phone p1 = new Phone(8901,"m1",8);
        Phone p2 = new Phone(8902,"m2",7);
        Phone p3 = new Phone(8903,"m3",6);
        System.out.print("Первый:");
        System.out.println("number: "+p1.getNumber() + ",model: " + p1.getModel()+",weight: "+p1.getWeight());
        System.out.print("Второй:");
        System.out.println("number: "+p2.getNumber() + ",model: " + p2.getModel()+",weight: "+p2.getWeight());
        System.out.print("Третий:");
        System.out.println("number: "+p3.getNumber() + ",model: " + p3.getModel()+",weight: "+p3.getWeight());
        p1.receiveCall("Абонент1");
        p2.receiveCall("Абонент2");
        p3.receiveCall("Абонент3");
        p1.SendMessag(8977,8999);
        p2.SendMessag(8996);
        p3.SendMessag(8977,8962);
    }
}

