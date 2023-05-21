package datastructures.arrays.twopointerQuestions;

public class RemoveAlphaNumeric {


}

class GFG {

    // Main driver method
    public static void main(String args[])
    {
        // Custom input string
        String str1 = "@!Geeks-for'Geeks, 123";
        String newstr = "";

        for (int i = 0; i < str1.length(); i++) {

            boolean b1 = Character.isDigit(str1.charAt(i));
            boolean b2 = Character.isAlphabetic(str1.charAt(i));

            if (b1 || b2) {
                newstr += str1.substring(i, i + 1);
            }
        }

        System.out.println(newstr);
    }
}