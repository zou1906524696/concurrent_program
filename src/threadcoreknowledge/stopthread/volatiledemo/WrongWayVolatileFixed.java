package threadcoreknowledge.stopthread.volatiledemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 描述：演示volatile的局限
 * 陷入阻塞时，volatile是无法停止线程的
 * 此例子中，生产者的生产速度很快，消费者消费速度慢
 * 所以出现阻塞队列满了以后，生产者会阻塞，等待消费者进一步消费
 * **/
public class WrongWayVolatileFixed {
    public static void main(String[] args) throws InterruptedException {
        WrongWayVolatileFixed body = new WrongWayVolatileFixed();

        ArrayBlockingQueue storage = new ArrayBlockingQueue(10);
        Producer producer = body.new Producer(storage);
        Thread producerThread = new Thread(producer);
        producerThread.start();
        Thread.sleep(1000);

        Consumer consumer = body.new Consumer(storage);
        while (consumer.needMoreNums()){
            System.out.println(consumer.storage.take() + "被消费了");
            Thread.sleep(100);
        }
        System.out.println("消费者不需要更多数据了");
        producerThread.interrupt();
    }

    class Producer implements Runnable{

        BlockingQueue storage;
        public volatile boolean canceled = false;
        public Producer(BlockingQueue storage) {
            this.storage = storage;
        }

        @Override
        public void run() {
            int num = 0;
            try{
                while (num <= 100000 && !Thread.currentThread().isInterrupted()){
                    if(num % 100== 0){
                        storage.put(num);
                        System.out.println(num + "是100的倍数,被放到仓库中");
                    }
                    num++;
                    //Thread.sleep(1);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                System.out.println("生产者停止运行");
            }
        }
    }

    class Consumer{
        BlockingQueue storage;

        public Consumer(BlockingQueue storage) {
            this.storage = storage;
        }
        public boolean needMoreNums(){
            if (Math.random() > 0.95){
                return false;
            }
            return true;
        }
    }
}