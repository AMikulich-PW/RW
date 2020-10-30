package lr3;

import java.util.ArrayList;

public class Box {
    ArrayList<Fruit> fruits = new ArrayList<>();

    public int size()
    {
        return fruits.size();
    }
    
    public void add(Fruit item)
    {
        if (fruits.size()!=0) {
            if (fruits.get(0).getClass() != item.getClass())
            {
                System.out.println("Error!");
            }
            else
            {
                fruits.add(item);
                System.out.println("Ok!");
            }
        }
        else
        {
            fruits.add(item);
            System.out.println("Ok!");
        }
    }

    public void remove(int index)
    {
        fruits.remove(index);
    }
    
    public Fruit get(int index)
    {
        return fruits.get(index);
    }
    
    public void clear()
    {
        fruits.clear();
    }
    
    public double getWeight()
    {
        double Sum=0;
        for (int i =0;i<size();i++)
        {
            Sum+=get(i).wt;
        }
        return Sum;
    }
    
    public boolean Compare(Box crate)
    {
        return this.getWeight()==crate.getWeight();
    }
    
    public void messege(Box crate)
    {
        if(this!=crate) {
            if (this.size() != 0) {
                if (crate.size() != 0) {
                    if (crate.get(0).getClass() == this.get(0).getClass()) {
                        for (int i = 0; i < this.size(); i++) {
                        	crate.add(this.get(i));
                        }
                        this.clear();
                        System.out.println("Îk!");
                    } else System.out.println("Error!");
                } else {
                    for (int i = 0; i < this.size(); i++) {
                    	crate.add(this.get(i));
                        System.out.println("Ok!");
                    }
                    this.clear();
                }
            } else System.out.println("Null!");
        }else System.out.println("Error!");
    }
    
    public static void main(String[] args)
    {
        Apple A1 = new Apple(1);
        Orange O1 = new Orange(3);
        Orange O2 = new Orange(4);
        System.out.println(O1.wt);
        Box crate1 = new Box();
        Box crate2 = new Box();
        crate1.add(O1);
        crate1.add(O1);
        System.out.println(crate1.size());
        crate1.add(A1);
        crate2.add(A1);
        crate2.add(O2);
        crate2.add(A1);
        System.out.println(crate2.getWeight());
        System.out.println(crate1.getWeight());
        System.out.println(crate1.Compare(crate2));
        System.out.println(crate1.size());
        crate1.remove(0);
        System.out.println(crate1.size());
        crate1.clear();
        crate1.add(O1);
        crate1.add(O2);
        System.out.println(crate1.size());
        crate2.messege(crate1);
    }
}

