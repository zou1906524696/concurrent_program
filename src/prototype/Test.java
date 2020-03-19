package prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Resume a = new Resume("大鸟");
//        a.SetPersonalInfo("男","30");
//        a.SetWorkExperience("2019-2020","xx公司");
//        Resume b = a;
//        Resume c = a;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        Resume b = new Resume("大鸟");
//        b.SetPersonalInfo("男","31");
//        b.SetWorkExperience("2019-2020","xx公司");
//
//        Resume c = new Resume("大鸟");
//        c.SetPersonalInfo("男","32");
//        c.SetWorkExperience("2019-2020","xx公司");

//        Resume2 d = a;
//        Resume2 e = a;
//        System.out.println(d);
//        System.out.println(e);
//        Resume2 a = new Resume2("大鸟");
//        a.SetPersonalInfo("男","30");
//        a.SetWorkExperience("2019-2020","xx公司");
//
//        Resume2 b = (Resume2) a.clone();
//        b.SetWorkExperience("2018-2019","yy公司");
//        Resume2 c = (Resume2) a.clone();
//        c.SetWorkExperience("2018-2019","zz公司");
//        Resume3 a = new Resume3("大鸟");
//        a.SetWorkExperience("2019-2020","xx公司");
//        a.SetPersonalInfo("男","30");
//        Resume3 b = (Resume3) a.clone();
//        b.SetWorkExperience("2019-2020","yy公司");
//        b.SetPersonalInfo("男","31");
//        Resume3 c = (Resume3) a.clone();
//        c.SetWorkExperience("2019-2020","zz公司");
//        c.SetPersonalInfo("男","32");

        Resume4 a = new Resume4("大鸟");
        a.SetWorkExperience("2019-2020","xx公司");
        a.SetPersonalInfo("男","30");

        Resume4 b = (Resume4) a.clone();
        b.SetWorkExperience("2019-2020","yy公司");
        b.SetPersonalInfo("男","31");

        Resume4 c = (Resume4) a.clone();
        c.SetWorkExperience("2019-2020","zz公司");
        c.SetPersonalInfo("男","32");

        System.out.println("a= " + a.toString());
        System.out.println("b= " + b.toString());
        System.out.println("c= " + c.toString());
    }
}
