package threadcoreknowledge.createthread;

/**
 * 描述：用Runnable方式创建线程，实现Runnable接口
 * */
public class RunnableStyle implements Runnable{

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("用Runnable方式实现线程");
    }
}
