package synchronizedcode;

/**
 * 类锁的第一种形式，static形式
 * **/
public class SynchronizedClassStatic implements Runnable {
    static SynchronizedClassStatic instance1 = new SynchronizedClassStatic();
    static SynchronizedClassStatic instance2 = new SynchronizedClassStatic();

    @Override
    public void run() {
        method();
    }
    public static synchronized void method(){
        System.out.println("我是类锁的第一种形式，static形式" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(instance1);
        Thread thread2 = new Thread(instance2);
        thread1.start();
        thread2.start();
        while (thread1.isAlive() || thread2.isAlive()){

        }
        System.out.println("finished");
    }
}
