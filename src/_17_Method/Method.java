package _17_Method;

public class Method {
    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("전");
        sayHello();
        System.out.println("후");
    }
}
