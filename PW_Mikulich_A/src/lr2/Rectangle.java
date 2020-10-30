package lr2;

public class Rectangle implements Shape {
	
    double a,b;
    
    public Rectangle(double a,double b) {
        this.a=a;
        this.b=b;
    }
    
    public double square(){
        return a*b;
    }
}

