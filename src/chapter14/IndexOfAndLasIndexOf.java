package chapter14;

public class IndexOfAndLasIndexOf {
    public static int indexOf(String word, char target) {
        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) == target) return index;
        }
        throw new InvalidTargetException("Invalid target,Check target");
    }

    public static int lastIndexOf(String word) {
        return word.length() - 1;

    }


}
