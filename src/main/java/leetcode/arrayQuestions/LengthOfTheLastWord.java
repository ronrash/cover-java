package leetcode.arrayQuestions;

public class LengthOfTheLastWord {



    public static void main(String[] args) {
        String s =" the sky is  ";

        lengthOftheLastWord(s);
        System.out.println(lengthOftheLastWord(s));
    }

    private static int lengthOftheLastWord(final String s) {
        System.out.println(s.trim());
       String [] array =s.split(" ");
        return array[array.length - 1].length();
    }
}
