package clase;

public class License implements AbstractTourismLicense{
    //implementare EAGER - THREAD SAFE
    private int licenseNumber=100;
    private int noChanges=0;
    private static final License instance=new License();//OBLIGATOIRU FINAL - e final pe referinta deci putem modifica in continuare obiectul
    private License(){

    };
    public static License getInstance(){

        return instance;
    }

    public void setLicenseNumber(int number){
        if(noChanges==0){
            this.licenseNumber=number;
            noChanges++;
        }else throw new RuntimeException ("the license number has been already modified. no more modifications left.") {
        };

    }

    @Override
    public String toString() {
        return "License{" +
                "licenseNumber=" + licenseNumber +
                ", noChanges=" + noChanges +
                '}';
    }
}
