package factorymethod;

public class FactoryDevide implements IFactory {
    @Override
    public Operator CreateOperation() {
        return new OperatorDevide();
    }
}
