package chapter14;

public class ComparingPortionsOfString {
    public static boolean portionOfString(String wordOne,String wordTwo,int wordOneStartIndex,int wordEndIndex,int len){
       return wordOne.regionMatches(true,wordOneStartIndex,wordTwo,wordEndIndex,len);

    }
}
