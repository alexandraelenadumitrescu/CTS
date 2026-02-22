public abstract class ElectronicDevice {
    protected int batteryLevel=100;
    void showBattery(){
        System.out.printf(String.valueOf(batteryLevel));
    }
}
