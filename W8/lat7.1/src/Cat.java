
public class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
    
    public static void main(String Args[]){
        Animal obj = new Cat();
        obj.sound();
    }
}
