package Chapter3;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int age;
    private  int maximumHeartRate;





    public HeartRates(String firstName,String lastName,int monthOfBirth,int dayOfBirth,int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;

    }
    public void setFirstName(String name){
        this.firstName = name;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String surname){
        this.lastName = surname;
    }
    public String getLastName(){
        return lastName;
    }
    public void setDayOfBirth(int date){
        this.dayOfBirth = date;
    }
    public int getDayOfBirth(){
        return dayOfBirth;
    }
    public void setMonthOfBirth(int month) {
        this.monthOfBirth = month;
    }
    public int getMonthOfBirth(){
        return monthOfBirth;
    }

    public void setYearOfBirth(int year){
        this.yearOfBirth = year;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public int getAge(){
        return 2023 - yearOfBirth ;
    }

    public int getMaximumHeartRate(){
        int heartRate = 220 - getAge();
        return maximumHeartRate = heartRate;
    }

    public double getTargetHeartRateOne() {
        return maximumHeartRate * 0.5;
    }
    public double getTargetHeartRateTwo(){
        return maximumHeartRate * 0.85;
    }









}
