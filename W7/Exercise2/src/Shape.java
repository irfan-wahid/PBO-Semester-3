
public class Shape {
    String color;
    Boolean  filled;
    
    public Shape(){
        color = "green";
        filled = true;
    }
    
    public Shape(String c, boolean f){
        color = c;
        filled = f;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setFilled(boolean f){
        filled = f;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public String toString(){
        return "Shape[color=" + color + "filled=" + filled + "]";
    }
}
