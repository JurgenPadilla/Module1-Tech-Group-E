public class Circle {

    private static final double PI = 3.14159;

    private double radius;

    public Circle(double radius){
       setRadius(radius);
        this.radius = 0.0;
   }

    public void setRadius(double radius) {
     this.radius = radius;
  }


    public double getArea() {
        return PI * radius * radius;
    }


}
