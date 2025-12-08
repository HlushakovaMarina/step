package L08_12_2025;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread {
    static AtomicInteger counter = new AtomicInteger(0);
    /*public static synchronized void increment(){
        counter++;
    }*/
static  final Object lockA = new Object();
static  final Object lockB = new Object();
    public static void main(String[] args) throws InterruptedException {

        Thread t3 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("t3 взял А");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lockB){
                    System.out.println("t3 взял B");
                }
            }
        });
        Thread t4 = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("t4 взял B");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lockA){
                    System.out.println("t4 взял A");
                }
            }
        });
        t3.start();
        t4.start();

        Runnable task = ()-> {
            for (int i = 0; i < 1000; i++) {
                //increment();
                counter.incrementAndGet();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("counter = " + counter);

        Thread th = new Thread(() -> {
            System.out.println("Привет!");
        });
        th.start();


    Thread th2 = new Thread(() -> {
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    });
    th2.start();

    Thread a = new Thread(()->{
        for (int i = 0; i <5 ; i++) {
            System.out.println("Работник А");
        }
    });
        Thread b = new Thread(()->{
        for (int i = 0; i <5 ; i++) {
            System.out.println("Работник В");
        }
    });
        a.start();
        a.join();
        b.start();

        Thread th3 = new Thread(()->{
            System.out.println("Сплю");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Меня разбудили!");
            }
        });
        Thread.sleep(1000);
        th3.start();
        th3.interrupt();


}
}
