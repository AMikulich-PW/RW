package lr2;

public class Animal {
    public String food;
    public String location;
    
    public void makeNoise()
    {
      System.out.println("»здаю шум");
    }
    public void eat()
    {
        System.out.println("≈м" + food);
    }
    public void sleep()
    {
        System.out.println("Cплю");
    }
    public Animal(String a, String b)
    {
        food = a;
        location = b;
    }
}
