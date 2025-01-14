package Instrument;

public abstract class StringedInstrument extends Instrument {
    private int numberOfStrings;
    

    public StringedInstrument(String name, int numberOfStrings){
        super(name);
        this.numberOfStrings=numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    
}


