public abstract class ElectronicDevice implements Chargable {
    protected int batteryLevel=100;
    void showBattery(){
        System.out.printf(String.valueOf(batteryLevel));
    }

    @Override
    public void charge(int amount) {
        if(amount>=0){
            if(batteryLevel+amount<=100){
                batteryLevel+=amount;
            }else{
                batteryLevel=100;
            }
        }

    }
}
