import pestera_proxy.implementare_initiala.IPestera;
import pestera_proxy.implementare_initiala.Pestera;
import pestera_proxy.implementare_proxy.PesteraProxy;

public class Main {
    public static void main(String[] args) {
        IPestera p=new PesteraProxy(new Pestera());

        p.viziteaza("Gigel",true);
        p.viziteaza("Gigel",true);
        p.viziteaza("Gigel",true);
        p.viziteaza("Gigel",true);
        p.viziteaza("Gigel",true);
        p.viziteaza("Gigel",true);
        p.viziteaza("Gigel",true);
        p.viziteaza("Gigel",true);
        p.viziteaza("Gigel",false);





        //dupa un timp au aparut restricitii
        //aplicam un proxy peste pestera
        //IPestera pesteraProxy=new PesteraProxy(p);
//        pesteraProxy.viziteaza("gigel",true);
//        pesteraProxy.viziteaza("gigel",true);
//        pesteraProxy.viziteaza("gigel",true);
//        pesteraProxy.viziteaza("gigel",true);
//        pesteraProxy.viziteaza("gigel",true);
//        pesteraProxy.viziteaza("gigel",true);
//        pesteraProxy.viziteaza("gigel",true);
    }
}