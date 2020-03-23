package factorymethod;

public class FactoryReduce implements IFactory {
    @Override
    public Operator CreateOperation() {
        return new OperatorReduce();
    }
}
