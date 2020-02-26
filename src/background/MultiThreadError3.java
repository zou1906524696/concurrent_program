package background;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:发布溢出了,我们使用了错误的发布方法，也就是get方法，然后被其他的用户进行修改了。
 * */
public class MultiThreadError3{

    private Map<String,String> state;

    public Map<String, String> getState() {
        return state;
    }
    //xiu fu
    public Map<String, String> getStateImproved() {
        return new HashMap<>(state);
    }

    public MultiThreadError3(){
        state = new HashMap<>();
        state.put("one","周一");
        state.put("two","周二");
        state.put("three","周三");
        state.put("four","周四");
        state.put("five","周五");
    }

    public static void main(String[] args) {
        MultiThreadError3 m1= new MultiThreadError3();
        System.out.println(m1.getStateImproved().get("one"));
        m1.getStateImproved().remove("one");
        System.out.println(m1.getStateImproved().get("one"));
    }

}
