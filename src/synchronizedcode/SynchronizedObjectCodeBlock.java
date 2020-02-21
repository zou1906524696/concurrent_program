package synchronizedcode;

/**
 * 对象锁实例1：代码块形式
 * 锁对象的选取
 * **/
public class SynchronizedObjectCodeBlock implements Runnable {
    static SynchronizedObjectCodeBlock instance = new SynchronizedObjectCodeBlock();
    static SynchronizedObjectCodeBlock instance2 = new SynchronizedObjectCodeBlock();
    //自己创建一把锁 不是一把锁，就可以并行运行
    Object lock1 = new Object();
    Object lock2 = new Object();
    @Override
    public void run() {
        synchronized (lock1){
            System.out.println("我是lock1。我叫"
                    + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "lock1运行结束");
        }
        synchronized (lock2){
            System.out.println("我是lock2。我叫"
                    + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "lock2运行结束");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance2);
        thread1.start();
        thread2.start();
        while (thread1.isAlive() || thread2.isAlive()){

        }
        System.out.println("finished");
    }
}
