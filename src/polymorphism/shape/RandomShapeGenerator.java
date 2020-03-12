package polymorphism.shape;

import java.util.Random;

public class RandomShapeGenerator {
    private Random random = new Random();

    public Shape next(){
        switch (random.nextInt(3)){
            case 1:
                return new Circle();
            case 2:
                return new Square();
            case 0:
                return new Triangle();
            default:
                return null;
        }
    }
}
