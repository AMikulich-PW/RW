package lr2;
public class Cat extends Animal {
    private int tail;
    
    public Cat(String a, String b, int c) {
        super(a, b);
        tail = c;
    }

    public void makeNoise()
    {
        System.out.println("ћ€у");
    }
    public void eat()
    {
        System.out.println("≈м" + food);
    }
    public void sleep()
    {
        System.out.println("—плю оооочень много");
    }

}

