package s7.singleton_game_manager.main;

import s7.singleton_game_manager.implementare.GameScoreManager;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        GameScoreManager manager=GameScoreManager.getInstance();
        try {
            manager.submitScore("john",50);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        manager.displayLeaderboard();
        try {
            manager.submitScore("john",60);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        manager.displayLeaderboard();


        int noThreads=5;

        ExecutorService ex= Executors.newFixedThreadPool(noThreads);
        AtomicInteger x= new AtomicInteger(10);

        for(int i=0;i<noThreads;i++){

            ex.execute(
                    ()->{
                        try {
                            x.getAndIncrement();
                            manager.submitScore("hai"+String.valueOf(x),100);
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        manager.displayLeaderboard();
                        System.out.println(Thread.currentThread().getName());
                    }
            );

        }
        ex.shutdown();




    }
}
