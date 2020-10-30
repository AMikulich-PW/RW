package lr2;

public class Circle implements Shape {
	
    double r;
    
    public Circle(double r)
    {
        this.r=r;
    }
    
    public double square(){
        return Math.pow(r,2)*Math.PI;
    }
}

