package ArrayExecise;

public class SortedString {
    public static void main(String[] args) {
        System.out.println(sortStrings("acb"));
    }
    public static String  sortStrings(String words) {
        int smallest = 0;
        char charSmallest = '0';
        char charOther = '0';
        StringBuilder word = new StringBuilder(words);
        for(int index = 0;index < words.length();index++) {
            for (int count = index+1; count < words.length(); count++) {
                smallest = words.charAt(index);
                int others = words.charAt(count);
                if (others < smallest) {
                    int temp = others;
                    charSmallest = (char) smallest;
                    charOther = (char) temp;
                    System.out.println(charSmallest);
                    System.out.println(charOther);
                }
                word.setCharAt(index,charSmallest);
                word.setCharAt(count,charOther);
            }



        }

        return words;
        }


    }

