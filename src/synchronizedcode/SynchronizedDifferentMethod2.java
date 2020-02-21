package synchronizedcode;

/**
 * 同时访问同一个类的不同的普通同步方法
 * */
public class SynchronizedDifferentMethod2 implements Runnable {
    static SynchronizedDifferentMethod2 instance1 = new SynchronizedDifferentMethod2();
    public static void main(String[] args) {
        Thread thread1 = new Thread(instance1);
        Thread thread2 = new Thread(instance1);
        thread1.start();
        thread2.start();
        while (thread1.isAlive() || thread2.isAlive()){

        }
        System.out.println("finished");
    }
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Thread-0")){
            method1();
        }else {
            method2();
        }
    }
    public synchronized void method1(){
        System.out.println("我是加锁方法,我叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }
    public synchronized void method2(){
        System.out.println("我也是加锁方法 叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }
}
