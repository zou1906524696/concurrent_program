package strategymode;

public class CashDebate extends Cashsuper {
    private double debate = 0.0;
    public CashDebate(double debate){
        this.debate = debate;
    }
    @Override
    public double getMoney(double money) {
        return money * debate;
    }
}
