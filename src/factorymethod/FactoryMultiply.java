package factorymethod;

public class FactoryMultiply implements IFactory {
    @Override
    public Operator CreateOperation() {
        return new OperatorMultiply();
    }
}
