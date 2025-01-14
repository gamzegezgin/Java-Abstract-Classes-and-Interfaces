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
    public void draw(){
        for(int line=1; line<a; line++){
            for(int i=0; i<line; i++){
                System.out.println("*");
            }
            System.out.println();
        }

    }
    
}
