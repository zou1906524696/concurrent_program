package singleton;

/**
 * 描述: 懒汉式(线程不安全)
 * **/
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3(){

    }
    //如果两个线程同时到达，会出现线程不安全的情况
    public static Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
