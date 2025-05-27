package _25_casting.Animal;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
        d.wagtail();

        //업케스팅
        Dog a = new Dog();
        a.speak();
        a.wagtail();

        Animal a2 = d;
        a2.speak();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog[] dogs = {
                dog1,
                dog2,
                dog3
        };

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal tiger = new Tiger();

        Animal[] animals = {
                dog,
                cat,
                tiger
        };

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
