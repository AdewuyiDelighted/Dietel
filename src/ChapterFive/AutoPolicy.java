package ChapterFive;

public class AutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;


    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;

    }
    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        if (state == "CT") {
            this.state = state;
        }
        else if(state == "MA"||state == "ME"|| state == "NH" ||
                state == "NJ" ||state == "NY"|| state == "PA"|| state == "VT" ){
            this.state = state;
        }
        else{
            System.out.println("Invalid input");
        }
    }
    public String getState(){
        return state;
    }
}
