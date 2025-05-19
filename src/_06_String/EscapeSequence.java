package _06_String;

public class EscapeSequence {
    public static void main(String[] args) {
        // /n /t // \' \"



        String id = "080811 3456789";
        System.out.println(id.substring(0,8));
        System.out.println(id.substring(0,id.indexOf("-")+2));

    }
}
