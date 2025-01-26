package dsa.arrays;


// https://leetcode.com/problems/valid-anagram/

public class ValidAnagram {


  public boolean isAnagram(String s, String t) {

    if (s == null || t == null || s.length() != t.length())
      return false;

    boolean res = true;
    int[] sArr = new int[26];

    for (int i = 0; i < s.length(); i++) {
      int ascii = s.charAt(i) - 97;
      sArr[ascii]++;
    }

    for (int j = 0; j < t.length(); j++) {

      if (sArr[(int) t.charAt(j) - 97] < 1) {
        res = false;
        break;
      } else {
        sArr[(int) t.charAt(j) - 97]--;

      }
    }

    return res;
  }
}
