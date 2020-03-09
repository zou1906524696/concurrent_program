package simplefactory;

public class OperatorDevide extends Operator {
    @Override
    public double getResult() {
        if (getNumber2() == 0){
            throw new RuntimeException("除数不能为零");
        }
        return getNumber1() / getNumber2();
    }
}
