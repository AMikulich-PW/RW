package lr2;

public class Lorry extends Car {
    double gryzPod;

    void start() {
        System.out.println("Грузовик поехал");
    }

    void stop() {
        System.out.println("Грузовик остановился");
    }

    void printinfo() {
        System.out.println("Марка машины: " + marka + "\n клсасс машины: " + clas + "\n вес машины: " + wt + "\n грузоводъёмность кузова: " + gryzPod + "\n мощность мотора: " + motor.might + "\n Производитель мотора: " + motor.maker);
    }
}
