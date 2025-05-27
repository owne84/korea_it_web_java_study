package _24_interface;

public class TvRemoteController {

    private PowerButton powerButton;
    private ChannerUpButton channerUpButton;
    private ChannerDownButton channerDownButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;


    public TvRemoteController(PowerButton powerButton, ChannerUpButton channerUpButton,ChannerDownButton channerDownButton,VolumeUpButton volumeUpButton, VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channerDownButton = channerDownButton;
        this.channerUpButton = channerUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    public void onPressedPowerButton() {
        System.out.print("TV의");
        powerButton.onPress();
    }

    public void onPressedChannerUpButton() {
        System.out.print("TV의 ");
        channerUpButton.onUp();
    }

    public void onPressedChannerDownButton() {
        System.out.print("TV의 ");
        channerDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        System.out.print("TV의 ");
        volumeUpButton.onUp();
    }

    public void onPressedVolumeDownButton() {
        System.out.print("TV의 ");
        volumeDownButton.onDown();
    }
}
