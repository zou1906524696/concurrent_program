package polymorphism.music;

import polymorphism.Note;

public class Brass extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Brass.play()" + n);
    }

    @Override
    void adjust() {
        System.out.println("adjusting brass");
    }
}
