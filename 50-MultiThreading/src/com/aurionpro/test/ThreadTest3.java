package com.aurionpro.test;

public class ThreadTest3 {

    public static void main(String[] args) {
        ThreadTest3 threadTest = new ThreadTest3();
        threadTest.startThreads();
    }

    public void startThreads() {
        Thread t1 = new Thread(new InnerClass(), "staticThread1");
        t1.start();

        Runnable runObj = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Anonymous class");
            }
        };
        Thread t2 = new Thread(runObj, "staticThread2");
        t2.start();

        Runnable printNum = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Preserve interrupted status
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        };
        Thread t3 = new Thread(printNum, "numPrintingThread");
        t3.start();
    }

    static class InnerClass implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": Static inner class");
        }
    }
}
