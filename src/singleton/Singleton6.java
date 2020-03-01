package singleton;

/**
 * 描述: 双重检查
 * 优点: 线程安全；延迟加载；效率较高
 * 为什么要double-check
 * 1.线程安全
 * 2.单check为什么不行？
 * 3.单层锁，但是synchronized放在方法上，这样可以，但是会导致性能问题
 *
 * 为什么要用volatile
 * 1.新建对象实际上有3个步骤（分配内存资源，调用构造函数，将对象指向分配的内存空间）
 * 2.重排序会带来NPE
 * 3.防止重排序
 * */
public class Singleton6 {
    private volatile static Singleton6 instance;
    private Singleton6(){

    }
    public static Singleton6 getInstance(){
        if (instance == null){
            synchronized (Singleton6.class){
                if (instance == null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
