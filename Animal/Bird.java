package Animal;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, String diet, boolean canFly){
        super(name, diet);
        this.canFly=canFly;
    }

    public void setCanFly(boolean canFly){
        this.canFly=canFly;
    }

    public boolean getCanFly(){
        return canFly;
    }

    @Override
    public String getSound(){
        return "cikcikcik";
    }

    @Override
    public String toString(){
        return String.format("%s %s %s", super.toString(), "and can they fly: ", getCanFly());
    }
}
