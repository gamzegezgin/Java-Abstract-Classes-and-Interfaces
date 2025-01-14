package Shape;
public class RightTriangle extends Shape {
    private int a;

    public RightTriangle(String name, int a){
        super(name);
        this.a=a;
    }

    public int getA(){
        return a;
    }

    //abstract metod override işlemi
    @Override
    public void draw(){
        System.out.println("Drew a right triangle.");
    
}
}