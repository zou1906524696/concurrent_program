package polymorphism.shape;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args){
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
//            if (a%3==1) {
//                Shape shape = new Circle();
//                shape.draw();
//            }else if (a%3==2){
//                Shape shape = new Square();
//                shape.draw();
//            }else {
//                Shape shape = new Triangle();
//                shape.draw();
//            }
        }
        for (int i = 0; i < 9; i++) {
            s[i].draw();
        }
    }
}
