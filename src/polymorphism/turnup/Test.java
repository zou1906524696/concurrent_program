package polymorphism.turnup;

public class Test {
    public static void ride(Cycle cycle){
        cycle.ride();
    }
    public static void main(String[] args){
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
