package polymorphism;

public class Brass extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Brass Instrument()" + n);
    }
}
