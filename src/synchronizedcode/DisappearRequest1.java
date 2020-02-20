package synchronizedcode;

/**
 * 描述：消失的请求
 * */
public class DisappearRequest1 implements Runnable {
    static DisappearRequest1 instance = new DisappearRequest1();
    static int i = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("i="+i);
    }

    //方法一：对象锁的普通方法
    //public synchronized void run()

    @Override
    public void run() {
        //方法二：对象锁的同步代码块
        //synchronized (this){
        //方法三：类锁的*.class
        // synchronized (DisappearRequest1.class) {
//        for (int j = 0; j < 100000; j++) {
//            i++;
//        }
        method();
    }

    //方法四：类锁在synchronized加在static方法上
    public static synchronized void method(){
        for (int j = 0; j < 100000; j++) {
            i++;
        }
    }
}
