package lr2;

public class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;
    
    public Student(String firstName,String lastName,String group, double averageMark){
      this.firstName = firstName;
      this.lastName = lastName;
      this.group = group;
      this.averageMark = averageMark;
    }
    public int getScholarship(double a)
    {
        if (a==5) return 100;
        else return 80;
    }
    public static void main(String[] args) {
        Student[] students= new Student[4];
        students[0]= new Student("Student1","S1","Gr1",5.0);
        students[1]= new Student("Student2","S2","Gr1",4.2);
        students[2]= new Aspirant("Aspirant1","A1","Gr1",4.4,"Научная работа 1");
        students[3]= new Aspirant("Aspirant2","A2","Gr1",5.0,"Научная работа 2");
        for (int i = 0; i<students.length; i++)
        {
            System.out.println(students[i].getScholarship(students[i].averageMark));
        }
    }
}
