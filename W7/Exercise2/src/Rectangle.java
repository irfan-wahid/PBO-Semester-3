
public class Rectangle extends Shape {
    private double width;
    private double length;
    
    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }
    
    public Rectangle(double w, double l){
        super();
        length = l;
        width = w;
    }
    
    public Rectangle(double w, double l, String c, boolean f){
        super(c, f);
        length = l;
        width = w;
    }
    
    public void setWidth(double w){
        width = w;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setLength(double l){
        length = l;
    }
    
    public double getArea(){
        return length;
    }
    
    public double getPerimeter(){
        return 2*length+2*width;
    }
    
    @Override
    public String toString(){
        return "Rectangle[" + super.toString() + "length" + length + "width" + width +"]";
    }
}
