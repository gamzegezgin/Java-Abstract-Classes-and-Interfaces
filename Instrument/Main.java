package Instrument;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("My guitar",6);
        Flute flute = new Flute("My flute");
 
        guitar.play();
        flute.play();

        System.out.println();
    }
}
