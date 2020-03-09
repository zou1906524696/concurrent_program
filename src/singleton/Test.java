package singleton;

public class Test {
    private final static Test INSTANCE = new Test();
    private Test(){

    }
    public static Test getInstance(){
        return INSTANCE;
    }
}
class Test2{
    private final static Test2 INSTANCE = new Test2();

    private Test2(){

    }
    public static Test2 getInstance(){
        return INSTANCE;
    }
}
class Test3{
    private final static Test3 INSTANCE = new Test3();
    private Test3(){

    }
    public static Test3 getInstance() {
        return INSTANCE;
    }
}
