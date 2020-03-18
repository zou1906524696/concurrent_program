package state;

public class ScoreStateTest {
    public static void main(String[] args) {
        ScoreContext context = new ScoreContext();
        System.out.println("学生测试成绩:");
        context.add(30);
        context.add(40);
        context.add(25);
        context.add(-30);
        context.add(-40);
    }
}
