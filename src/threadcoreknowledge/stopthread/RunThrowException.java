package threadcoreknowledge.stopthread;

/**
 * 描述：run无法checked exception，只能用try/catch
 * **/
public class RunThrowException {
    public void aVoid () throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        new Thread( new Runnable() {
            @Override
            public void run() {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    //保存日志、停止程序
                    e.printStackTrace();
                }
            }
        });
    }
}
