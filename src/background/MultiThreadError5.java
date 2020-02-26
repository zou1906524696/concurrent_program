package background;
/**
 * 描述:注册监听器还是有隐患
 * **/
public class MultiThreadError5 {
    int count;
    public MultiThreadError5(MySource source){
        source.registerListener(new EventListener() {
            @Override
            public void onEvent(Event e) {
                System.out.println("\n我得到的数字是" + count);
            }
        });
        for (int i = 0; i < 1000; i++) {
            System.out.print(i);
        }
        count = 100;
    }

    public static void main(String[] args) {
        MySource mySource = new MySource();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mySource.eventCome(new Event() {
                });
            }
        }).start();
        MultiThreadError5 multiThreadError5 = new MultiThreadError5(mySource);
    }
    static class MySource{
        private EventListener listener;
        void registerListener(EventListener eventListener){
            this.listener = eventListener;
        }
        void eventCome(Event e){
            if (listener != null){
                listener.onEvent(e);
            }else {
                System.out.println("还未完成初始化");
            }
        }
    }
    interface EventListener{
        void onEvent(Event e);
    }
    interface Event{

    }
}
