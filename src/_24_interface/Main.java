package _24_interface;

public class Main {
    public static void main(String[] args) {

        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannerUpButton(),
                new ChannerDownButton(),
                new VolumeUpButton(),
                new VolumeDownButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton();

        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onPressedChannerDownButton();
        tvRemoteController.onPressedChannerUpButton();
    }
}
