package threadcoreknowledge;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 描述:第一种：运行结果出错
 * 演示计数不准确(减少)，找出具体出错的为位置
 * **/
public class MultiThreadsError implements Runnable{
    static MultiThreadsError instance = new MultiThreadsError();
    int index = 0;
    static AtomicInteger realIndex = new AtomicInteger();
    static AtomicInteger wrongIndex = new AtomicInteger();
    static CyclicBarrier cyclicBarrier1 = new CyclicBarrier(2);
    static CyclicBarrier cyclicBarrier2 = new CyclicBarrier(2);
    static final boolean[] marked = new boolean[999999999];
    public static void main(String[] args) throws InterruptedException {
        marked[0] = true;
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
        thread1.join();;
        thread2.join();
        System.out.println("真正运行的次数" + realIndex);
        System.out.println("表面运行的次数" + instance.index);
        System.out.println("错误的次数" + wrongIndex);
    }

    //多出现的问题 index 会改变
    //1.cyclicBarrier
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            try {
                cyclicBarrier2.reset();
                cyclicBarrier1.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            index++;
            try {
                cyclicBarrier1.reset();
                cyclicBarrier2.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            realIndex.incrementAndGet();
            synchronized (instance) {
                if (marked[index] && marked[index-1]) {
                    System.out.println("我出现问题了" + index);
                    wrongIndex.incrementAndGet();
                }
            }
            marked[index] = true;
        }
    }
}
