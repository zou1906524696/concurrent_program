package strategymode;

public class CashNormal extends Cashsuper {
    @Override
    public double getMoney(double money) {
        return money;
    }
}
