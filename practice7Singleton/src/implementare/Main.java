package implementare;

import clase.builder.Package;
import clase.builder.PackageBuilder;
import clase.singleton.License;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) {
        License l1;
        License l2;
        l1=License.getInstance();
        l2=License.getInstance();
        if(l1==l2){
            System.out.println("aceeasi instanta");
        }else{
            System.out.println("instante diferite");
        }
        try{
            l1.setLicenseNumber(200);
        }catch (Exception e){e.printStackTrace();}

        System.out.println(l1);
        System.out.println(l2);
        try{
            l1.setLicenseNumber(201);
        }catch (Exception e){e.printStackTrace();}
        System.out.println(l1);
        System.out.println(l2);
        int noThreads=5;
        try{
            ExecutorService e= Executors.newFixedThreadPool(noThreads);
            for(int i=0;i<noThreads;i++){
                e.execute(()->{License instance=License.getInstance();
                        System.out.println(Thread.currentThread().getName()+" "+instance.toString());}
                );

            }
            e.shutdown();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        PackageBuilder builder=new PackageBuilder();
        Package p1=builder.setCazare("cazare").build();
        Package p2=builder.setCazare("cazare2").build();
        Package p3=builder.setCazare("cazare3").build();
        System.out.printf(p1.toString());
        p1=p2;
        System.out.printf(p1.toString());

    }
}