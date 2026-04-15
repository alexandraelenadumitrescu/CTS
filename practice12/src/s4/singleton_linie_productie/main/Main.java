package s4.singleton_linie_productie.main;

import s4.singleton_linie_productie.implementare.LineControl;

import javax.sound.sampled.Line;
import java.lang.classfile.attribute.LineNumberInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        LineControl l=LineControl.getInstance();
        int noThreads=5;
        ExecutorService executor= Executors.newFixedThreadPool(noThreads);
        for(int i=0;i<noThreads;i++){
            executor.execute(
                    ()->{

                        try {
                            l.addTechnologicalStep("100","pas");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        System.out.println(Thread.currentThread().getName()+l.toString());

                    }

            );

        }
        executor.shutdown();
        System.out.println(l);
    }
}
