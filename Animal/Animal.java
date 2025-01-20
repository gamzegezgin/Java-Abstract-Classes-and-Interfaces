package Animal;

public abstract class Animal {
    private String name;
    private String diet;

    public Animal(String name, String diet){
        this.name = name;
        this.diet =  diet;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setDiet(String diet){
        this.diet = diet;
    }

    public String getDiet(){
        return diet;
    }

    public abstract String getSound();

    @Override
    public String toString(){
        return String.format("%s: \n %s: ", getName(), getDiet());
    }

}


