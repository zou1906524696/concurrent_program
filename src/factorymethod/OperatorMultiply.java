package factorymethod;

public class OperatorMultiply extends Operator {
    @Override
    public double getResult() {
        return getNumber1() * getNumber2();
    }
}
