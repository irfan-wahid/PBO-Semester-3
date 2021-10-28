
public class Test {
    
    public static void main (String[] args) {
        
        Shape s = new Shape();
        System.out.println("Shape\n"
        + "color " + s.color
        + " filled " + s.filled);
        
        Shape s1 = new Shape("purple", true);
        System.out.println("Shape\n"
        + "color " + s1.color
        + " filled " + s1.filled);
        
        System.out.println(s1.toString());
        
        
        Circle c = new Circle();
        System.out.println("\n Circle\n"
        + "Area " + c.getArea()
        + " Perimeter " + c.getPerimeter());
        System.out.println(c.toString());
        
        Rectangle r = new Rectangle();
        System.out.println("\n Rectangle\n"
        + "Area " + r.getArea()
        + " Perimeter " + r.getPerimeter());
        System.out.println(r.toString());
        
        Square sq = new Square();
        System.out.println("\n Square\n"
        + "Area " + sq.getArea()
        + " Perimeter " + sq.getPerimeter());
        System.out.println(sq.toString());
    }
    
}
