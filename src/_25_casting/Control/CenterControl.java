package _25_casting.Control;

public class CenterControl {

    private Power[] deviceArray;

    public CenterControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) {

        int emotyIndex = checkEmpty();

        if(emotyIndex == -1) {
            System.out.println("장치출가 불가");
            return;
        }

        deviceArray[emotyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치연결됨");

    }

    public int checkEmpty() {
        for(int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                return i;
            }
        }

        return -1;
    }

    public void powerOn() {
        for (Power device : deviceArray) {
            if(device == null) {
                System.out.println("등록안된 슬롯");
                continue;
            }

            device.On();
        }
    }

    public void powerOff() {
        for (Power device : deviceArray) {
            if(device != null) {
                System.out.println("등록된 슬롯");
                continue;
            }

        }
    }

    public void performSpecificMethod() {
        for (Power device : deviceArray) {
            Tv tv = (Tv) device;
            tv.On();
        }
    }
}
