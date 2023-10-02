package Chapter3;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;
    private int maximumHeartRate;


    public HealthProfile(String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;

    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String surname) {
        this.lastName = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDayOfBirth(int day) {
        this.dayOfBirth = day;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setMonthOfBirth(int month) {
        this.monthOfBirth = month;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setYearOfBirth(int year) {
        this.yearOfBirth = year;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setHeight(double  height) {
        this.height = height;
    }
     public  double getHeight(){
        return height;
     }
     public void setWeight(double weight){
        this.weight = weight;
     }
     public double getWeight(){
        return weight;
     }
     public int getAge(){
        int age = 2023 - yearOfBirth;
        return age;
     }
     public int  getMaximumHeartRate(){
        int heartRate = 220 - (2023 - yearOfBirth);
        return maximumHeartRate = heartRate;
     }
     public double getTargetedHeartRateOne(){
        return maximumHeartRate * 0.5;
     }
     public double getTargetedHeartRateTwo(){
        return maximumHeartRate * 0.85;
     }
     public double getBodyMassIndex(){
        double bodyMassIndex = weight * 703/height*height;
        return bodyMassIndex;
     }



















}