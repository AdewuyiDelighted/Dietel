package MrChibuzorAssignment;

public class Utme{

    public static void main(String[] args) {
        int result = priceOfCopies(3);
        System.out.println(result);
    }




public static int priceOfCopies(int copy){
        return copies(copy);
}
    public static int copies(int copy){

        if(copy < 5) {
            return copy * 2000;
        }
        else if(copy <  10){
            return  copy * 1800;
        }
        else if (copy < 30){
        return copy * 1600;
        }
        else if (copy < 50) {
            return copy * 1500;
        }
        else if (copy < 100) {
            return copy * 1300;
        }
        else if (copy < 200) {
            return copy * 1200;
        }
        else if (copy < 500) {
            return copy * 1100;
        }
        else{
            return copy * 1000;
        }
}

}


















