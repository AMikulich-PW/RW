package lr2;

public class Animal {
    public String food;
    public String location;
    
    public void makeNoise()
    {
      System.out.println("����� ���");
    }
    public void eat()
    {
        System.out.println("��" + food);
    }
    public void sleep()
    {
        System.out.println("C���");
    }
    public Animal(String a, String b)
    {
        food = a;
        location = b;
    }
}
