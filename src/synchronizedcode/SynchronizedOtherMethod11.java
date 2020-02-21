package synchronizedcode;

/**
 * 描述：可重入粒度测试，递归类内的另外的方法
 * **/
public class SynchronizedOtherMethod11 {
    int a = 0;

    public static void main(String[] args) {
        SynchronizedOtherMethod11 synchronizedOtherMethod11 = new SynchronizedOtherMethod11();
        synchronizedOtherMethod11.method1();
    }

    private synchronized void method1(){
        System.out.println("这个method1");
        method2();
    }
    private synchronized void method2(){
        System.out.println("这个method2");
    }
}
