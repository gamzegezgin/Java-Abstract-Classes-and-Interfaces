package Animal;

public class Mamal extends Animal {

    private String furType;
    

    public Mamal(String name, String diet, String furType){
        super(name,diet);
        this.furType=furType;
    }

    public void setFurType(String furType){
        this.furType=furType;
    }

    public String getFurType(){
        return furType;
    }

    @Override
    public String getSound(){
        return "mamal sounds";
    }

    @Override
    public String toString(){
        return String.format(" %s \n %s %s ", super.toString(), "their fur type: ", getSound());
    }
}
