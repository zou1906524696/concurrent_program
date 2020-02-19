package threadcoreknowledge.stopthread;

/**
 * 描述：如果在执行线程过程中，每一次循环都会调用sleep或者wait等方法，那么
 * **/
public class RightWayStopThreadWithSleepEveryLoop {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () ->{
            int num = 0;
            try {
                while (num <= 10000){
                    if (num % 100 == 0){
                        System.out.println(num + "是100的倍数");
                    }
                    num++;
                    Thread.sleep(10); //异常抛出
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
    }
}
