package Instrument;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Guitarella",6);
        Flute flute = new Flute("Flutella");
 
        guitar.play();
        flute.play();

        System.out.println();
    }
}
