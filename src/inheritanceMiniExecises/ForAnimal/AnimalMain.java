package inheritanceMiniExecises.ForAnimal;

import java.util.Arrays;

public class AnimalMain {
    public static void main(String[] args) {
//        Animal[] animal = new Animal[5];
//        animal[0] = new Animal();
//        animal[1] = new Cat();
//        animal[2] = new Dog();
//        animal[3] = new Goat();
//        animal[4] = new Lion();

        Animal meow = new Cat();
        meow.speak();
        Animal bark = new Dog();
        bark.speak();
        Animal bleat = new Goat();
        bleat.speak();
        Animal lion = new Lion();
        lion.speak();
        Animal pup = new Puppy();
        pup.speak();
        Puppy puppy = new Puppy();
       // puppy.eat(DOOO);


//        for(int index = 0 ; index < animal.length;index++){
//            animal[index].speak();
//        }
    }
}
