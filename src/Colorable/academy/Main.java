package Colorable.academy;

public class Main {
    public static void main(String[] args) {

        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square();
        for (Shape sh:shape) {
            System.out.println(sh);
            if( sh instanceof Rectangle){
                ((Rectangle)sh).howtoColor();
            }
        }
    }
}
