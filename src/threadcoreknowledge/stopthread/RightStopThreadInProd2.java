package threadcoreknowledge.stopthread;

/**
 * 描述：最佳实践2：在catch语句中调用Thread.currentThread().isInterrupted()来恢复设置中断状态，以便于在后续的执行中，依然能够检查到刚才发生了
 * 中断回到刚才RightStopThreadInProd补上中断，让它跳出
 * **/
public class RightStopThreadInProd2 implements Runnable{
    @Override
    public void run() {
        while (true){
            if (Thread.currentThread().isInterrupted()){
                System.out.println("Interrupt程序运行结束");
                break;
            }
            reInterrupt();
        }
    }

    private void reInterrupt(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RightStopThreadInProd2());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
