package threadcoreknowledge.stopthread;

/**
 * 描述：最佳实现：catch了interruptException之后优先选择：在方法签名中抛出异常
 * 那么在run()就会强制try/catch
 * **/
public class RightStopThreadInProd implements Runnable{
    @Override
    public void run() {
        while (true && !Thread.currentThread().isInterrupted()){
            System.out.println("go");
            try {
                throwInMethod();
            } catch (InterruptedException e) {
                System.out.println("保存日志");
                e.printStackTrace();
            }
        }
    }

    private void throwInMethod() throws InterruptedException {
            Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RightStopThreadInProd());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
