public abstract class
ElectronicDevice implements Chargable,Comparable<ElectronicDevice> {
    protected int batteryLevel=100;
    void showBattery(){
        System.out.printf(String.valueOf(batteryLevel));
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "batteryLevel=" + batteryLevel +
                '}';
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

    @Override
    public int compareTo(ElectronicDevice o) {
        return this.batteryLevel-o.batteryLevel;
    }
}
