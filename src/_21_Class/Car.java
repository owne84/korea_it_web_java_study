package _21_Class;

public class Car {
    String carName;
    int carYearModel;
    String carColor;

    Car() {
        System.out.println("껍데기");
    }

    Car(String carNm) {
        System.out.println();
        this.carName = carNm;
    }

    Car(String carName, int carYearModel, String carColor) {
        this.carName = carName;
        this.carColor = carColor;
        this.carYearModel = carYearModel;
    }

    public void starCar() {
        System.out.println("시동을건다");
    }

    public void drive() {
        System.out.println("출발한다");
    }
}
