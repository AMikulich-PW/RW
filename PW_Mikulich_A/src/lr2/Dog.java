package lr2;
public class Dog extends Animal {
    private String Poroda;
    
    public Dog(String a, String b, String c) {
        super(a, b);
        Poroda = c;
    }

    public void makeNoise()
    {
        System.out.println("���");
    }
    public void eat()
    {
        System.out.println("��" + food);
    }
    public void sleep()
    {
        System.out.println("����� ����");
    }

}
