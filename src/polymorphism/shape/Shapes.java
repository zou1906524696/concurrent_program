package polymorphism.shape;

import java.util.HashMap;
import java.util.Random;

public class Shapes {
    public static void main(String[] args){
        Random r = new Random();
        for (int i = 0; i < 9; i++) {
            int a = r.nextInt(10);
//            System.out.println(a);
            if (a%3==1) {
                Shape shape = new Circle();
                shape.draw();
            }else if (a%3==2){
                Shape shape = new Square();
                shape.draw();
            }else {
                Shape shape = new Triangle();
                shape.draw();
            }
        }
    }
}
