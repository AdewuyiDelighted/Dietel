package StudentPackage;

import StudentPackage.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
@Test
    public void testThatMajorAndStatusOfStudent(){
   String result = Student.major("M1");
    assertEquals("Mathematics FreshMan",result);

}
@Test
    public void testTheMajorAndStatusOfStudentInComputerScience(){
    String result = Student.major("C3");
    assertEquals("Computer science Junior",result);
}
@Test
    public void testTheMajorAndStatusOfStudentInInformationAndScience(){
    String result = Student.major("I2");
    assertEquals("Information technology Sophomore",result);
}
@Test
    public void testInvalidInput(){
    String result = Student.major("G4");
    assertEquals("Invalid input",result);
}
}