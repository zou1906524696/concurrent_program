package simplefactory;

public class SwitchOperator {
    public static Operator getOperator(String str){
        Operator operator = null;
        switch (str){
            case "+":
                operator = new OperatorAdd();
                break;
            case "-":
                operator = new OperatorReduce();
                break;
            case "*":
                operator = new OperatorMultiply();
                break;
            case "/":
                operator = new OperatorDevide();
                break;
            default:
                throw new RuntimeException("请输入正确的运算符");
        }
        return operator;
    }
}
