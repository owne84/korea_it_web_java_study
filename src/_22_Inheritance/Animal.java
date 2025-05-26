package _22_Inheritance;

import java.util.Scanner;

public class Animal {
    Scanner sc = new Scanner(System.in);

    String Animal_name;

    public void setAnimal_name(String animal_name) {
        Animal_name = animal_name;
    }

    public String getAnimal_name() {
        return Animal_name;
    }

    int Animal_age;

    public void setAnimal_age(int Animal_age) {
        this.Animal_age = Animal_age;
    }

    public int getAnimal_age() {
        return Animal_age;
    }

    public void getAnimalName() {
        System.out.print("이름 : ");
        String Animal_name = sc.next();
    }
}
