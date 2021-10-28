
public class Square extends Rectangle{
    
    public Square(){
        super();
    }
    
    public Square(double side){
        super(side,side);
    }
    
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    
    public void setSide(double side){
        super.setWidth(side);
    }
    
    public double getSide(){
        return super.getWidth();
    }
    
    public double getArea(){
        return getSide()*getSide();
    }
    
    public double getPerimeter(){
        return 4*getSide();
    }
    
    @Override
    public void setWidth(double side){
       super.setWidth(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    
    @Override
    public String toString(){
        return "Rectangle[" + super.toString() + "side" + getSide() + "]";
    }
    
}
