package strategymode;

public class StrategyTest {
    public static void main(String[] args){
        CashContext context =  new CashContext(new CashNormal());
        System.out.println("正常计费" + context.ContextInterface(200));

        context = new CashContext(new CashDebate(0.8));
        System.out.println("打折活动" + context.ContextInterface(200));

        context = new CashContext(new CashReturn(100,20));
        System.out.println("满减活动" + context.ContextInterface(200));
    }
}