package strategymode;

public class CashReturn extends Cashsuper {
    private double condition = 0.0;
    private double moneyReturn = 0.0;
    public CashReturn(double condition,double moneyReturn){
        this.condition = condition;
        this.moneyReturn = moneyReturn;
    }
    @Override
    public double getMoney(double money) {
        if (money >= condition){
            money = money - Math.floor(money/condition) * moneyReturn;
        }
        return money;
    }
}
