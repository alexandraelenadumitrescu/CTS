import static java.lang.Math.sqrt;

public class Verifica {

    boolean isPrime(int number){
        for(int x=2;x<=sqrt(number);x++){

            if(number%x==0){
                return false;
            }

        }
        return true;
    }
}
