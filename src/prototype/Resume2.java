package prototype;

/**
 * 原型模式：用原型实例指定创建对象的总类，并且通过拷贝这些原型创建新的对象
 * */

public class Resume2 implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;
    public Resume2(String name){
        this.name = name;
    }
    //设置个人信息
    public void SetPersonalInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }
    //设置工作经历
    public void SetWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
