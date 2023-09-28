package StudentPackage;




public class Student{
    public static String major(String major) {
        String result = " ";
        switch (major) {
            case "M1":
                return "Mathematics FreshMan";
            case "M2":
                return "Mathematics Sophomore";
            case "M3":
                return "Mathematics Junior";
            case "M4":
                return "Mathematics Senior";
            case "C1":
                return "Computer science Freshman";
            case "C2":
                return "Computer science Sophomore";
            case "C3":
                return "Computer science Junior";
            case "C4":
                return "Computer science Senior";
            case "I1":
                return "Information technology Freshman";
            case "I2":
                return "Information technology Sophomore";
            case "I3":
                return "Information technology Junior";
            case "I4":
                return "Information technology Senior";
            default:
                return "Invalid input";

        }
    }


}