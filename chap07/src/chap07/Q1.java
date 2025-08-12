package chap07;

class Car {
    String model;
    String company;
    boolean power;
    int speed;

    Car(String model, String company) {
        this.model = model;
        this.company = company;
        this.power = false;
        this.speed = 0;
    }

    void start() {
        power = true;
    }

    void stop() {
        speed = 0;
        power = false;
    }

    void speedUp() {
        if (power == true) speed++;
    }

    void speedDown() {
        if (speed > 0) speed--;
    }
}

class AmbulanceCar extends Car {
    boolean siren;

    AmbulanceCar(String model, String company) {
        super(model, company);
    }

    void siren() {
        siren = !siren;
        System.out.println(siren ? "사이렌이 울립니다." : "사이렌을 멈춥니다.");
    }

    void firstAid() {
        System.out.println("응급처치를 하였습니다.");
    }
}

public class Q1 {
    public static void main(String[] args) {
        AmbulanceCar ac = new AmbulanceCar("Ambulance", "Hyundai");
        ac.start();
        ac.speedUp();
        ac.speedUp();
        ac.siren();
        ac.firstAid();
        ac.speedDown();
        ac.stop();
        ac.siren();
    }
}
