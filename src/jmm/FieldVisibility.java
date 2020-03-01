package jmm;

/**
 * 描述:演示可见性带来的问题
 * **/
public class FieldVisibility {
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;

    private void change() {
        a = 5;
        b = 6;
        c = 7;
        synchronized (this){
            d = 8;
        }

    }

    private void print() {
        synchronized (this){
            int aa = a;
        }
        int bb = b;
        int cc = c;
        int dd =d;
        System.out.println("aa=" + a + ",bb=" + bb );
        System.out.println("cc=" + cc + ",dd=" + dd );
    }


    public static void main(String[] args) {
        FieldVisibility test = new FieldVisibility();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                test.change();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                test.print();
            }
        }).start();
    }
}
