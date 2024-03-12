package com.example.myjavaproject.assignment5.question5;

import java.util.concurrent.Semaphore;
public class Main {
    static String[] names = {"Nguyen Van Huan", "Nguyen Linh Duc", "Nguyen Van Tan", "Vu Viet Tung", "Tran Trung Nghia"};
    static String[] hometowns = {"Ha Noi", "Hung Yen", "Thanh Hoa", "Ha Tinh", "Quang Ninh"};

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        Thread thread1 = new Thread(new Thread1(semaphore));
        Thread thread2 = new Thread(new Thread2(semaphore));

        thread1.start();
        thread2.start();
    }

    static class Thread1 implements Runnable {
        Semaphore semaphore;

        public Thread1(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    semaphore.acquire();
                    System.out.println(names[i]);
                    semaphore.release();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Thread2 implements Runnable {
        Semaphore semaphore;

        public Thread2(Semaphore semaphore) {
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    semaphore.acquire();
                    System.out.println(hometowns[i]);
                    semaphore.release();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
