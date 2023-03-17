package rikkei.academy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double percent = Math.random() * 100 + 1;
        Circle circle = new Circle(10);
        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square();


//        for (Shape sh:shape) {
//            if(sh instanceof Circle){
//                System.out.println(((Circle)sh).resize());
//            }
//        }

        System.out.println(percent);
        System.out.println("giá trị diện tích hình tròn trước thay đổi: "+ circle.getArea());
        circle.resize(percent);
        System.out.println("giá trị sau thay đổi:  " + circle.getArea());


    }
}
