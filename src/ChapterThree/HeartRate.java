package ChapterThree;

public class HeartRate {

    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int age;
    private  int maximumHeartRate;





    public void HeartRates(String firstName,String lastName,int monthOfBirth,int dayOfBirth,int yearOfBirth){
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
    public void setAge(int birthYear , int currentYear){
      int yourAge = 2023 - birthYear;
    this.age = yourAge;
    }
    public int getAge(){
        return age;
    }
    public void setMaximumHeartRate(int yearOfBirth , int currentYear) {
    int heartRate = 220 - (currentYear - yearOfBirth);

    this.maximumHeartRate = heartRate;
    }

    public int getMaximumHeartRate(){
        return maximumHeartRate;
    }

    public double getTargetHeartRateOne() {
        return maximumHeartRate * 0.5;
    }
    public double getTargetHeartRateTwo(){
        return maximumHeartRate * 0.85;
    }









}

