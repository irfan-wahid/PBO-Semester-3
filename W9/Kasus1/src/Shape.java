
public abstract class Shape {
    protected String shapeName;
    
    public Shape(String shapeName){
        this.shapeName = shapeName;
    }
    
    abstract double area();
    
    public String toString(){
        this.shapeName = shapeName;
        return this.shapeName;
    }
    
}
