public class SmartTV extends ElectronicDevice implements RemoteControllable{
    private boolean isOn=false;
    @Override
    public void pressButton() {


            if(batteryLevel<=0) {
                //System.out.printf("baterie descarcata");
                throw new BatteryEmptyException("baterie descarcata");

            }else{
                isOn=!isOn;
                if(isOn){
                    System.out.println("s a deschis televizorul");
                    batteryLevel-=10;
                }else{
                    System.out.println("s a inchis televizorul");
                }


            }


    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
