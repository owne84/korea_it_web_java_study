package _22_Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Tiger tiger = new Tiger();
//
//        System.out.print("호랑이 이름 짓기 : ");
//        tiger.tiger_name = sc.next();
//
//        System.out.println(tiger.tiger_name);
        System.out.print("이름 : ");
        int age = sc.nextInt();
        System.out.println("나이 : ");
        String name = sc.next();
        Human hm = new Human(name, age);

        System.out.println(hm.getAnimal_name());
        System.out.println(hm.getAnimal_age());



    }
}
