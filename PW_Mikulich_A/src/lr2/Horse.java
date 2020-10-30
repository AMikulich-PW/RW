package lr2;
public class Horse extends Animal {
    private double streng;
    
    public Horse(String a, String b, double c) {
        super(a, b);
        streng = c;
    }

    public void makeNoise()
    {
        System.out.println("Игого");
    }
    public void eat()
    {
        System.out.println("Я ем" + food);
    }
    public void sleep()
    {
        System.out.println("Почти не сплю");
    }

}

