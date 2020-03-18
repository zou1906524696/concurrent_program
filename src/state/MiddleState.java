package state;

public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state) {
        hj = state.hj;
        stateName = "中等";
        score = state.score;
    }

    @Override
    public void checkState() {
        if (score >= 90){
            hj.setState(new HighState(this));
        }else if(score < 60){
            hj.setState(new LowState(this));
        }
    }
}
