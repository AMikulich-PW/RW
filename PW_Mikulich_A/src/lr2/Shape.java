package lr2;

public interface Shape {
	
	public double square();

    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] =  new Triangle(3,4,5);
        shape[1] =  new Circle(20);
        shape[2] =  new Rectangle(25, 30);
        for (Shape sh: shape){
            System.out.println("������� ������: " + sh.square());
        }
    }

}

