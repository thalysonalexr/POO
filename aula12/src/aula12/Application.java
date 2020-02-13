/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lab
 */
public class Application {
    
    interface AddInterface {
        public int add(int a, int b);
    }
    
    interface PrintInterface {
        public void print(String s);
    }
    
    PrintInterface ip;
    
    public void setCallback(PrintInterface ip) {
          this.ip = ip;
    }
    
    public void newEvent(String s) {
        if (this.ip != null)
            this.ip.print(s);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // lambda
        AddInterface ai = (a, b) -> a + b;
        
        AddInterface ai2 = new AddInterface() {
            public int add(int a, int b) {
                return a + b;
            }
        };
        
        System.out.println(ai.add(10, 30));
        System.out.println(ai2.add(30, 50));
        
        PrintInterface pi = (s) -> System.out.println(s);
        
        pi.print("Hello World!");
        
        Application app = new Application();
        
        app.setCallback(pi);
        app.setCallback(pi);
        app.newEvent("My event!");
        
        Runnable t = new Runnable() {
            Random r = new Random();
                
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(r.nextInt(1000));
                    } catch (InterruptedException e) {}
                    System.out.println("T1: " + (i + 1));
                }
            }
        };
        
        Runnable t2 = () -> {
            Random r = new Random();
            
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(r.nextInt(1000));
                } catch (InterruptedException e) {}
                System.out.println("T2: " + (i + 1));
            }
        };
        
        new Thread(t).start();
        new Thread(t2).start();
        new Thread(() -> {
            Random r = new Random();
            
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(r.nextInt(1000));
                } catch (InterruptedException e) {}
                System.out.println("T3: " + (i + 1));
            }
        }).start();
    }
    
}
