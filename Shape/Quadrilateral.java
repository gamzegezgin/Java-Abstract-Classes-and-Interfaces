package Shape;
public abstract class Quadrilateral extends Shape {
    public Quadrilateral(String name) {
        super(name);
    }

//abstract medodu doldurmadıgımız için class ve metod abstract kalmaya devam ediyor
public abstract void draw();
}
