package polymorphism;

public class Wind extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Wind Instrument()" + n);
    }
}
