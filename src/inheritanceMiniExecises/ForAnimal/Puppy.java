package inheritanceMiniExecises.ForAnimal;

public class Puppy extends Dog{
    Food food = new Food("Milk");
   @Override
    public void speak(){
        System.out.println("small bark !!!");
    }
    public void sleep(){
        System.out.println("I sleep buh my parent dont");
    }
    public void eat(Food food){
        System.out.println("I enjoy eating " + food.getFood() +" than bones unlike my parent");
    }
}
