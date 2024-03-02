package chapter14;

public class ComparingPortionsOfString {
    public static void main(String[] args) {
        System.out.println(portionOfString("semicolonins","assicolonin"));
        System.out.println("semicolonins".substring(4,7));
        System.out.println("assicolonins".substring(4,7));
    }
    public static boolean portionOfString(String one,String two){
       boolean result =  one.regionMatches(true,4,two,7,two.length()+1);
        System.out.println(result);
        return result;
    }
}
