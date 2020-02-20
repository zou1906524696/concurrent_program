package synchronizedcode;

/**
 * 对象锁实例2：方法锁
 * */
public class SynchronizedObjectMethod implements Runnable{
    static SynchronizedObjectMethod instance = new SynchronizedObjectMethod();
    @Override
    public void run() {
        method();
    }
    public synchronized void method(){
        System.out.println("我是对象锁的方法修饰符的形式，我叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }
    public static void main(String[] args) {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
        while (thread1.isAlive() || thread2.isAlive()){

        }
        System.out.println("finished");
    }
}
