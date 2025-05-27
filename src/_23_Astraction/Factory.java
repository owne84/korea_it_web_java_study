package _23_Astraction;

import java.util.Scanner;

public class Factory {
    Scanner sc = new Scanner(System.in);
    String Name;

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public String setName() {
        this.Name = Name;
        System.out.println("공장이름 : ");
        String Name = sc.next();
        return Name;
    }
}
