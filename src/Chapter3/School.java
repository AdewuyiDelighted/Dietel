package Chapter3;

public class School {
    private int numberOfStudents;
    private String location;
    private String schoolName;


    public String getName() {
        return schoolName;
    }
    public String getLocation(){
        return location;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public void setSchoolName( String schoolName){
        this.schoolName = schoolName;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setNumberOfStudent(int numberOfStudents){
        this.numberOfStudents = numberOfStudents;
    }

}
