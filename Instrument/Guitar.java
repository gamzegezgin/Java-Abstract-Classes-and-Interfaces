package Instrument;

public class Guitar extends StringedInstrument {

    public Guitar(String name, int numberOfStrings){
        super(name,numberOfStrings);
    }
    public void play(){
        System.out.println("Guitar is rocking!");
    }
    
}
