package Chapter6;

public class BeautifyingString {
    public static void main(String[] args) {
        System.out.println(beautifyString("i am a boy"));
    }
    public static String addFullStop(String words){
        int length = words.length();
        char lastCharacter = words.charAt(length-1);
        if( lastCharacter != '.') {
            return words + ".";
        }
       return words;
    }
    public static String addCapitalLetter(String words){
        char firstLetter = words.charAt(0);
        String firstLetters = String.valueOf(firstLetter);
        if(firstLetters != firstLetters.toUpperCase()){
            firstLetters = firstLetters.toUpperCase();
            char replace = words.charAt(0);
            String replaces = String.valueOf(replace);
            String newWord = words.replaceFirst(replaces,firstLetters);
// or return ((word.chartAt(0)+"").toUpperCase())+word.substring(beginIndex:1);
            return newWord;
        }
        return words;
    }

    public static String beautifyString(String words){
//        String fullStopWord = addFullStop(words);
//        String capitalLetters = addCapitalLetter(fullStopWord);
        return addFullStop(addCapitalLetter(words));
       // System.out.println(capitalLetters);

    }
}
