package _24_interface;

public class PowerButton extends Button{
    private boolean status;

    @Override
    public void onPress() {
        if(status) {
            System.out.println("전원 off");
        } else {
            status = true;
            System.out.println("전원 on");
        }
    }

    @Override
    public void onPressed() {

    }
}
