package _24_interface;

public class VolumeUpButton extends Button{
    @Override
    public void onPress() {

    }

    @Override
    public void onPressed() {
        System.out.println("소리를 키운다.");
    }

    @Override
    public void onUp() {
        System.out.println("소리를 키운다.");
    }
}
