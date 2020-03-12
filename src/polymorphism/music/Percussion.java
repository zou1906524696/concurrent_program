package polymorphism.music;

import polymorphism.Note;

public class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion.play()" + n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("adjusting Percussion");
    }
}
