import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class gasestePozMaxime {
    static Pereche aplica(int v[]){

        int poz1=-1;
        int poz2=-1;
        Set<Integer> set=new HashSet<>();
        for( int i=0;i<v.length;i++){
            if(v[i]<0){
                if(poz1<0){
                    poz1=i;
                }else{
                    poz2=i;
                }

            }
        }
        Pereche pereche=new Pereche(poz1,poz2);
        return pereche;
    }
}
