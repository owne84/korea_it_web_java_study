package _26_objects;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("ㅁㄴㅇ", "ㅁㄴㅇㅁㄴㅇ");
        Teacher teacher1 = new Teacher("asdasd", "asda");
        System.out.println(teacher);
        System.out.println(teacher.equals(teacher1));
    }
}
