package prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("大鸟");
        a.SetPersonalInfo("男","30");
        a.SetWorkExperience("2019-2020","xx公司");
        Resume b = a;
        Resume c = a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

//        Resume b = new Resume("大鸟");
//        b.SetPersonalInfo("男","31");
//        b.SetWorkExperience("2019-2020","xx公司");
//
//        Resume c = new Resume("大鸟");
//        c.SetPersonalInfo("男","32");
//        c.SetWorkExperience("2019-2020","xx公司");


//        Resume2 a = new Resume2("大鸟");
//        a.SetPersonalInfo("男","30");
//        a.SetWorkExperience("2019-2020","xx公司");
//
//        Resume2 b = (Resume2) a.clone();
//        Resume2 c = (Resume2) a.clone();
//
//        Resume2 d = a;
//        Resume2 e = a;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
    }
}
