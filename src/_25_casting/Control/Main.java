package _25_casting.Control;

public class Main {
    public static void main(String[] args) {
        Power[] powers = new Power[5];
        CenterControl centerControl = new CenterControl(powers);

        centerControl.addDevice(new Tv());

        centerControl.powerOff();
        centerControl.powerOn();




    }
}
