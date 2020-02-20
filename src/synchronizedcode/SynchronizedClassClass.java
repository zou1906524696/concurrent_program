package synchronizedcode;

/**
 * 类锁的形式2：.class
 * */
public class SynchronizedClassClass implements Runnable {
    static SynchronizedClassClass instance1 = new SynchronizedClassClass();
    static SynchronizedClassClass instance2 = new SynchronizedClassClass();
    @Override
    public void run() {
        method();
    }
    public void method(){
        //synchronized (this){
        synchronized (SynchronizedClassClass.class){
            System.out.println("我是类锁的第二种形式*.class形式。我叫" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行结束");
        }
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
