package lr2;
public class Cat extends Animal {
    private int tail;
    
    public Cat(String a, String b, int c) {
        super(a, b);
        tail = c;
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
        System.out.println("���� �������� �����");
    }

}

