package leetcode;

public class IsValidAnagram {
    public static void main(String[] args) {

        String s = "aabb";
        String t = "bbaa";

        System.out.println(isvalidAngram(s, t));
        System.out.println(isNewvalidAngram(s, t));

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

    private static boolean isNewvalidAngram(final String s, final String t){
            if(s.length()!=t.length())
        {
            return false;
        }

        int [] array = new int[26];
            int count =1;
         for(int i=0;i<s.length();i++)
         {

            final int x = s.charAt(i) - 'a';
              array[x]++;

            final int y = t.charAt(i) - 'a';
             array[y]--;
         }
         for(int counter :array)
         {
           if(counter!=0)
               return false;
         }
         return true;
    }
}
