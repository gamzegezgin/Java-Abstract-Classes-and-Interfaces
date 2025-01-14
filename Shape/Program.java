package Shape;
public class Program {
    public static void main(String[] args) {
        //Shape is still abstract so we can not create an object inside of it
        //Shape shape = new Shape("Shape");

        //same situation for quadrilateral
        //Quadrilateral quadrilateral = new Quadrilateral("Quadrilateral");

        // but rest of them can create objects, they are not abstract 
        Square s= new Square("Square", 4);
        s.draw();

        RightTriangle r = new RightTriangle("RightTriangle", 5);
        r.draw();




    }
}
