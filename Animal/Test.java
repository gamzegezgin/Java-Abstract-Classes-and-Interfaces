package Animal;

public class Test {
    
    public static void main(String[] args) {
        Mamal mamal = new Mamal("goril","omni", "fluffy");
        Bird bird = new Bird("serce", "herbi", true);
        
        System.out.printf("%s %s %s", mamal , "sounds like that:", mamal.getSound() );
        System.out.printf("%s %s %s", bird , "sounds like that:", bird.getSound() );


        Animal animals[] = new Animal[2];
        animals[0]= mamal;
        animals[1]=bird; 

        for(Animal currentAnimal: animals){
            System.out.println(currentAnimal);

            if(currentAnimal instanceof Bird){
                Bird animal = (Bird) currentAnimal;
                System.out.println("birds areee cute");


            }

            System.out.printf("sound %s \n\n", currentAnimal.getSound());
        }

        for(int i = 0; i<animals.length; i++){
            System.out.printf("Animal %d is a %s\n", i, animals[i].getClass().getName());
        }
    }
}
