package _21_Class;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.print("이름 입력 : ");
        st.name = sc.next();

        System.out.print("나이 입력 : ");
        st.age = sc.nextInt();

        System.out.print("이메일 입력 : ");
        st.email = sc.next();

        System.out.print("주소 입력 : ");
        st.address = sc.next();

        st.showInfo();
    }
}
