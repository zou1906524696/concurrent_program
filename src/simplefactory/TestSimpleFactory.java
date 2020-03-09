package simplefactory;

public class TestSimpleFactory {
    public static void main(String[] args){
        Operator test = SwitchOperator.getOperator("+");
        test.setNumber1(1);
        test.setNumber2(0);
        System.out.println("result = " + test.getResult());
    }
}
