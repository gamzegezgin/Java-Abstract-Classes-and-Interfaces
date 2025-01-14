public class Square extends Quadrilateral{
    private int a;

    public Square(String name, int a){
        super(name);
        this.a=a;
        
    }

    public int getA(){
        return a;
    }

    //draw override edelim ve boylece abstract kalkar
    public void draw(){
        System.out.println("Drew a square.");
    
}
}
