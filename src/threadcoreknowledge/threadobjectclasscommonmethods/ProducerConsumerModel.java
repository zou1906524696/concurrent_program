package threadcoreknowledge.threadobjectclasscommonmethods;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 描述:用wait、notify来实现
 * */
public class ProducerConsumerModel {
    class Producer implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
            }
        }
    }

    class EventStorage{
        private int maxSize;
        private List<Date> storage;
        public EventStorage(){
            maxSize = 10;
            storage = new ArrayList<>();
        }

    }
}
