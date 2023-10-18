package ChapterSix;

public class BeautifyingString {
    public static void main(String[] args) {
        beautifyString("mary");
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
        //String wordsWithFullStop = addFullStop(words);
        char firstLetter = words.charAt(0);
        String firstLetters = String.valueOf(firstLetter);
        if(firstLetters != firstLetters.toUpperCase()){
            firstLetters = firstLetters.toUpperCase();
            char replace = words.charAt(0);
            String replaces = String.valueOf(replace);
            String newWord = words.replaceFirst(replaces,firstLetters);

            return newWord;
        }
        return words;
    }

    public static void beautifyString(String words){
        String fullStopWord = addFullStop(words);
        String capitalLetters = addCapitalLetter(fullStopWord);
        System.out.println(capitalLetters);

    }
}
