package _22_Inheritance;

public class Tiger extends Animal{
    public String getTiger_name() {
        return tiger_name;
    }

    public void setTiger_name(String tiger_name) {
        this.tiger_name = tiger_name;
    }

    String tiger_name;



    public void hunt(){
        System.out.println(tiger_name + "사냥을 합니다.");
    }
}
