package polymorphism;

class Super{
    public int field = 0;
    public int getField(){
        return field;
    }
}
class Sub extends Super{
    public int field = 1;
    public int getField(){
        return field;
    }
    public int getSuperField(){
        return super.getField();
    }
}
public class FieldAccess {
    public static void main(String[] args){
        Super sup = new Sub();
        System.out.println(sup.getClass());
        System.out.println("sup.field: " + sup.field + " ,sup.getField: " + sup.getField());
        Sub sub = new Sub();
        System.out.println(sub.getClass());
        System.out.println("sub.field: " + sub.field + " ,sub.getField: " + sub.getField() + " ,super.getField: " + sub.getSuperField());
    }
}
