package threadcoreknowledge.threadobjectclasscommonmethods;

/**
 * 描述:线程ID从1开始，JVM运行起来后，我们自己创建的线程的ID早已不是0
 * */
public class Id {
    public static void main(String[] args) {
        Thread thread = new Thread();

        System.out.println("主线程" + Thread.currentThread().getId());
        System.out.println("子线程" + thread.getId());
    }
}
