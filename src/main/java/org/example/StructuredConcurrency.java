package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class StructuredConcurrency {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            System.out.println("Task 1 started");
            try{
                TimeUnit.SECONDS.sleep(2);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.println("Task 1 completed");
        });
        executor.shutdown();
        executor.awaitTermination(2, TimeUnit.SECONDS);
    }
}
