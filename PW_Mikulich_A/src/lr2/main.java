package lr2;

public class main {
    public static void main(String[] args) {
        vet Aibolit = new vet();
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Whiskas","Картонная коробка",13);
        animals[1] = new Dog("Кость","Конура","Лабрадор");
        animals[2] = new Horse("Сахар","Конюшня",1.1);
        for (int i=0;i<animals.length;i++)
        {
            Aibolit.treatAnimal(animals[i]);
        }
    }
}

