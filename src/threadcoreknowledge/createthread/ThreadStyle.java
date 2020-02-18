package threadcoreknowledge.createthread;

/**
 * 描述：用Thread方式创建线程，继承Thread，重写run
 * */
public class ThreadStyle extends Thread{
    @Override
    public void run() {
        System.out.println("用Thread类实现线程");
    }

    public static void main(String[] args) {
        new ThreadStyle().start();
    }
}
