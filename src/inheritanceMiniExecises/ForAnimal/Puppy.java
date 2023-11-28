package inheritanceMiniExecises.ForAnimal;

public class Puppy extends Dog{
   @Override
    public void speak(){
        System.out.println("small bark !!!");
    }
    public void sleep(){
        System.out.println("I sleep buh my parent dont");
    }
    public void eat(Food food){
        System.out.println("I enjoy eating " + food +" than bones unlike my parent");
    }
}
