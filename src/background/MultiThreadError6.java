package background;

import java.util.HashMap;
import java.util.Map;
/**
 * 描述:构造函数中运行线程
 * **/
public class MultiThreadError6 {
    private Map<String,String> state;

    public Map<String, String> getState() {
        return state;
    }

    public MultiThreadError6(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                state = new HashMap<>();
                state.put("one","周一");
                state.put("two","周二");
                state.put("three","周三");
                state.put("four","周四");
                state.put("five","周五");
            }
        });
        thread.start();
    }

    public static void main(String[] args) throws InterruptedException {
        MultiThreadError6 m1= new MultiThreadError6();
        //Thread.sleep(2000);
        System.out.println(m1.getState().get("one"));
    }
}
