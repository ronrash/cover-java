package leetcode;

public class IsValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "mnagraa";

        System.out.println(isvalidAngram(s, t));

    }

    private static boolean isvalidAngram(final String s, final String t) {

        int[] chars= new int[26];
        for(int i=0;i<s.length();i++)
        {
            chars[s.charAt(i)-'a']++; //[0,1]
            chars[t.charAt(i)-'a']--;
        }
        for(int count :chars)
        {
            if(count!=0)
                return false;
        }
        return true;
    }
}
