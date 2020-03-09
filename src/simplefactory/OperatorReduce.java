package simplefactory;

public class OperatorReduce extends Operator {
    @Override
    public double getResult() {
        return getNumber1()-getNumber2();
    }
}
