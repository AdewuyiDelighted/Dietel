package ArrayExecise;

public class SortedString {
    public static String sortStrings(String words) {
        for(int index = 0;index < words.length();index++) {
            for (int count = 0; count < words.length(); count++) {
                char minChar = words.charAt(index);
                int minIndex = index;
                if (words.charAt(count) < minChar) {
                    int newMin = count;
                    //words.charAt(minIndex) = words.charAt(newMin);
                }
            }
        }
        return words;
        }


    }

