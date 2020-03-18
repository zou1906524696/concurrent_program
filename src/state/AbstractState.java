package state;

public abstract class AbstractState {
    protected ScoreContext hj;
    protected String stateName;
    protected int score;
    public abstract void checkState();
    public void addScore(int x){
        score = score +x;
        System.out.print("加上：" + x + "分，当前：" + score + "分，");
        checkState();
        System.out.println("当前状态是" + hj.getState().stateName);
    }
}
