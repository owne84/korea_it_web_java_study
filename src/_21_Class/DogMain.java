package _21_Class;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.name = "방울이";
        dog.age = 3;

        System.out.println(dog.age);
        System.out.println(dog.name);

        dog.bark();
        dog.sleep();
    }
}
