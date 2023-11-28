package inheritanceMiniExecises.ForAnimal;

public class Food {
    private Food food;
    public Food(Food food){
        this.food = food;
    }
    public Food getFood(){
        return food; 
    }
}
