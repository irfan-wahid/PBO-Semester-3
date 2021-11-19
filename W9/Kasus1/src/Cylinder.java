public class Cylinder extends Shape{
    private double radius;
    private double heigth;
    
    public Cylinder(double r, double h){
        super(" Cylinder ");
        radius = r;
        heigth = h;
    }
    
    @Override
    public double area(){
        return Math.PI*radius*radius*heigth;
    }
    
    @Override
    public String toString(){
        return super.toString() + " of radius " + radius + " and heigth " + heigth;
    }
}