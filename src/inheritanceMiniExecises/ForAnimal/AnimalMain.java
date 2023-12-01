package inheritanceMiniExecises.ForAnimal;

import java.util.Arrays;

public class AnimalMain {
    public static void main(String[] args) {
       Food food = new Food("Milk");
        Animal[] animal = new Animal[6];
        animal[0] = new Animal();
        animal[1] = new Cat();
        animal[2] = new Dog();
        animal[3] = new Goat();
        animal[4] = new Lion();
        animal[5] = new Puppy();

//        Animal meow = new Cat();
//        meow.speak();
//        Animal bark = new Dog();
//        bark.speak();
//        Animal bleat = new Goat();
//        bleat.speak();
//        Animal lion = new Lion();
//        lion.speak();
//        Animal pup = new Puppy();
//        pup.speak();
        Puppy puppy = new Puppy();
//        puppy.speak();
//        puppy.sleep();
        //puppy.eat(new Food("rice"));
        puppy.eat(food);

//        Dog smallDog = new Dog();
//        smallDog.speak();



        for(int index = 0 ; index < animal.length;index++){
            animal[index].speak();

        }

    }
}
