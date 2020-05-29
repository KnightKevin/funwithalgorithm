package sort.test;

import java.util.Random;

public class App {
    public static void main(String[] args) {

       String s = "qweaccccccaee";
        
       handle(s);
        
    }

    public static void handle(String s) {
        Runnable r = ()->{
            while(true) {
                try {
                    Thread.sleep(1000);
                    System.out.println("lalalalala");
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
        };

        Thread t = new Thread(r);

        t.start();


        try {
            Thread.sleep(1500);
        } catch(Exception exception) {

        }


        t.interrupt();

    }


}