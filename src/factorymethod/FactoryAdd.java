package factorymethod;

public class FactoryAdd implements IFactory {
    @Override
    public Operator CreateOperation() {
        return new OperatorAdd();
    }
}
