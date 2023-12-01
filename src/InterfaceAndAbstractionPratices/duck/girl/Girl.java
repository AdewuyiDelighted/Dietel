package InterfaceAndAbstractionPratices.duck.girl;

public class Girl {
    private Boyfriend boyfriend;
    private Daddy daddy;

    public Girl(Boyfriend herGuy,Daddy myDaddy){
        this.boyfriend = herGuy;
        this.daddy = myDaddy;
    }


    public void heCares(){
        boyfriend.care();
    }
    public void spending(){
        boyfriend.spend();
    }
    public void heFearsGod() {
        boyfriend.godFearing();
    }
    public void hisLook(){
        boyfriend.handsome();
    }
    public void pray(){
        daddy.pray();
    }
    public void payBills(){
        daddy.payBills();
    }
    public void love(){
        daddy.love();
    }
    public void happy(){
        daddy.alwaysHappy();
    }
}
