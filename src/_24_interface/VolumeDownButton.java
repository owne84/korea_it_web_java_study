package _24_interface;

public class VolumeDownButton extends Button{
    @Override
    public void onPress() {

    }

    @Override
    public void onPressed() {
        System.out.println("소리를 낮춘다.");
    }

    @Override
    public void onDown() {
        System.out.println("소리를 낮춘다.");
    }
}
