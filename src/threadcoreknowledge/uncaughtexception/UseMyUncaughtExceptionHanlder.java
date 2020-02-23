package threadcoreknowledge.uncaughtexception;

/**
 * 描述:使用刚才自己写的MyUncaughtExceptionHanlder
 * **/
public class UseMyUncaughtExceptionHanlder implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHanlder("捕获器1"));
        new Thread(new UseMyUncaughtExceptionHanlder(),"MyThread-1").start();
        Thread.sleep(300);
        new Thread(new UseMyUncaughtExceptionHanlder(),"MyThread-2").start();
        Thread.sleep(300);
        new Thread(new UseMyUncaughtExceptionHanlder(),"MyThread-3").start();
        Thread.sleep(300);
        new Thread(new UseMyUncaughtExceptionHanlder(),"MyThread-4").start();
        Thread.sleep(300);
    }
    @Override
    public void run() {
        throw new RuntimeException();
    }
}
