package _25_casting.Animal;

public class Main2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Animal animal1 = new Dog();

        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);

        Animal animal2 = new Dog();
        if (animal2 instanceof Dog) {
            Dog animal4 = (Dog) animal2;

            animal4.speak();
            animal4.wagtail();
        }

        Animal animal3 = new Animal();
        if (animal3 instanceof Dog) {
            Dog dog3 = (Dog) animal3;

            dog3.speak();
            dog3.wagtail();

        }
    }
}
