package threadcoreknowledge.startthread;

/**
 * 描述：start() run()启动线程的方式
 * **/
public class StartAndRunMethod {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
        };
        runnable.run();

        new Thread(runnable).start();
    }
}
