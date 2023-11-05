package PersonalAssessement;

public class MulitThreadMain {
    public static void main(String[] args) {


        MultiThread thread = new MultiThread();
        // .start is used when you want it to run alone
        //.run is used when you want one thread to run first before another like below
        thread.run();
        System.out.println();
        System.out.println("""
                            My name is Delighted
                            The name of my school is semicolon
                            Located at yaba
                            """);
        thread.run();
    }
}
