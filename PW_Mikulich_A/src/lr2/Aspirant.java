package lr2;

public class Aspirant extends Student {
	
    public String Nauch_rab;
    
    public Aspirant(String firstName, String lastName, String group, double averageMark,String Nauch_rab) {
       super(firstName, lastName, group, averageMark);
       this.Nauch_rab =  Nauch_rab;
    }
    
    public int getScholarship(double a)
    {
        if (a==5) return 200;
        else return 180;
    }
}

