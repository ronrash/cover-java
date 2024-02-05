package datastructures.hashmaps.hashmapQuestions;

import java.util.HashMap;

public class RansomNote {

//    Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//    Each letter in magazine can only be used once in ransomNote.
//
//    Example 1:
//
//    Input: ransomNote = "a", magazine = "b"
//    Output: false
//    Example 2:
//
//    Input: ransomNote = "aa", magazine = "ab"
//    Output: false
//    Example 3:
//
//    Input: ransomNote = "aa", magazine = "aab"
//    Output: true

    public static void main(String[] args) {
        final String ransomeNote = "aa";
        final String magazine = "aab";
        System.out.println(canConstruct(ransomeNote, magazine));
    }

    private static boolean canConstruct(final String ransomeNote, final String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character ch : magazine.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);

        for (Character ch : ransomeNote.toCharArray()) {

            int count = map.getOrDefault(ch, 0);
            if (count == 0) {
                return false;
            }
           map.put(ch,count-1);
        }
        return true;
    }

}
