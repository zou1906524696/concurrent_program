package factorymethod;

public class OperatorAdd extends Operator{
    @Override
    public double getResult() {
        return getNumber1() + getNumber2();
    }
}
