package _21_Class;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.carName);

        Car car1 = new Car("싼타페", 2025, "흰색");
        System.out.println(car1);
    }
}
