package prototype;

/**
 * 原型模式：用原型实例指定创建对象的总类，并且通过拷贝这些原型创建新的对象
 * */

public class Resume4 implements Cloneable{
    private String name;
    private String sex;
    private String age;

    private WorkExperienceImprove workExperience;

    public Resume4(String name){
        this.name = name;
        this.workExperience = new WorkExperienceImprove();
    }
    public Resume4(WorkExperienceImprove workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperienceImprove) workExperience.clone();
    }
    //设置个人信息
    public void SetPersonalInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }
    //设置工作经历
    public void SetWorkExperience(String timeArea,String company){
        this.workExperience.setCompany(company);
        this.workExperience.setTimeArea(timeArea);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume4 resume4 = new Resume4(this.workExperience);
        resume4.name = this.name;
        resume4.age = this.age;
        resume4.sex = this.sex;
        return resume4;
    }

    @Override
    public String toString() {
        return "Resume3{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", workExperience=" + workExperience.getCompany() +
                ",  " + workExperience.getTimeArea() +
                '}';
    }
}
