public class Circle {
    private double radius;
    private double diameter;



    public Circle(double v, double radius){
        this.radius = radius;
        this.diameter = radius * 2;
    }

//get set
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
        this.diameter = radius * 2;
    }

    public double getDiameter(){
        return diameter;
    }

    //public void setDiameter (double diameter){
    //    this.diameter = diameter;
    //}

}



