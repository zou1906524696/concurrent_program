package background;

/**
 * 描述:对监听器的修复
 * **/
public class MultiThreadError7 {
    int count;
    private  EventListener listener;
    private MultiThreadError7(MySource source){
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

    //工厂方法
    public static MultiThreadError7 getInstance(MySource mySource){
        MultiThreadError7 safeListener = new MultiThreadError7(mySource);
        mySource.registerListener(safeListener.listener);
        return safeListener;
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
        MultiThreadError7 multiThreadError7 = getInstance(mySource);
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
                System.out.println("\n还未完成初始化");
            }
        }
    }
    interface EventListener{
        void onEvent(Event e);
    }
    interface Event{

    }
}
