package _25_casting.Control;

public class Tv implements Power{

    @Override
    public void Power() {
    }

    @Override
    public void On() {
        System.out.println("tv 전원 키기");
    }

    @Override
    public void Off() {
        System.out.println("tv 전원 끄기");
    }
}
