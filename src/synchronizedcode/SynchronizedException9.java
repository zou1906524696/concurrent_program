package synchronizedcode;

/***
 * 描述：方法抛异常后，会释放锁。展示不抛出异常前和抛出异常后的对比。一旦抛出了异常，第二个线程会立刻进入同步方法，意味锁已经释放
 * ***/
public class SynchronizedException9 implements Runnable {
    static SynchronizedException9 instance1 = new SynchronizedException9();
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
        System.out.println("我是静态加锁方法1,我叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        throw new RuntimeException();
    }
    public synchronized void method2(){
        System.out.println("我是非静态加锁方法 我叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println(Thread.currentThread().getName() + "运行结束");
        throw new RuntimeException();
    }
}
