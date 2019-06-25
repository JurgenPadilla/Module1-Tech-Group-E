import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {


        ArrayList circle = new ArrayList();
        double radius;
        do{
            radius = Math.random() - 0.05;
            System.out.println(radius);
            System.out.println("Creating a circle object.");
            Circle circleObj = new Circle(radius);
            double circleArea = circleObj.getArea();
            circle.add(circleArea);
        }while(radius> 0.01);

        System.out.println("Array List:");
        System.out.println(circle);
        }
    }


