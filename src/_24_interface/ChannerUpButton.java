package _24_interface;

public class ChannerUpButton extends Button{

    @Override
    public void onPress() {

    }

    @Override
    public void onPressed() {
        System.out.println("채널을 올린다.");
    }

    @Override
    public void onUp() {
        System.out.println("채널을 내린다.");
    }
}
