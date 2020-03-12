package polymorphism.music;

import polymorphism.Note;

public class Stringed extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Stringed.play()" + n);
    }

    @Override
    String what() {
        return "stringed";
    }

    @Override
    void adjust() {
        System.out.println("adjusting Stringed");
    }
}
