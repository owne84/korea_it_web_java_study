package _22_Inheritance;

import java.util.Scanner;

public class Human extends Animal{
    Scanner sc = new Scanner(System.in);

    public Human(String animal_name, int animal_age) {
        this.Animal_age = animal_age;
        this.Animal_name = animal_name;
    }

    public String getAnimal_name() {
        return "제 이름은 " + super.Animal_name + "입니다.";
    }

    public int getAnimal_age() {
        System.out.println("제 나이는 " + super.Animal_age + "입니다,");
        return super.Animal_age;
    }
}
