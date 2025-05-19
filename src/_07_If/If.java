package _07_If;

public class If {
    public static void main(String[] args) {
        //조건문

        int height = 130;
        if(height >= 120) {
            System.out.println("탑승가능");
        }

        boolean isAdult = false;
        if (isAdult && height >= 120) {

        System.out.println("탑승가능");
    }

        if (!isAdult || height >= 120) {

            System.out.println("탑승가능");
        }
    }
}
