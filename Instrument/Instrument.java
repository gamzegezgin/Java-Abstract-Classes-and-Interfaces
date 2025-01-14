package Instrument;
public abstract class Instrument {
    private String name;

    public Instrument(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }


    public abstract void play();
}
