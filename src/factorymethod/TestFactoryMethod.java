package factorymethod;

public class TestFactoryMethod {
    public static void main(String[] args){
        IFactory factory = new FactoryAdd();
        Operator operator = factory.CreateOperation();

        operator.setNumber1(1.0);
        operator.setNumber2(2.5);

        double result = operator.getResult();
        System.out.println(result);
    }
}
