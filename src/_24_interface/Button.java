package _24_interface;

public abstract class Button implements Press, Up, Down{
    @Override
    public void onDown() {

    }

    public abstract void onPress();

    @Override
    public abstract void onPressed();

    @Override
    public void onUp() {

    }
}
