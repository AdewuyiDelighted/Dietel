package InterfaceAndAbstractionPratices.duck.duck;

public class PastorChild extends Pastor{

    public void sing(){
        System.out.println("Im singing");
    }


    public void prays(String age){
        System.out.println("I stand while praying");

    }
    public void prays(int name){
        System.out.println("I stand while praying");
        System.out.println(1);

    }

    public static void main(String[] args) {
        PastorChild pastorChild = new PastorChild();

    }
}
