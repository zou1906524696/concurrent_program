package polymorphism.music;

import polymorphism.Note;

public class Wind extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Wind.play()" + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("adjusting wind()");
    }
}
