package strategymode;

public class CashContext {
    private Cashsuper cashsuper;
    public CashContext(Cashsuper cashsuper){
        this.cashsuper = cashsuper;
    }

    public double ContextInterface(double money){
        return cashsuper.getMoney(money);
    }
}
