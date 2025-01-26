package dsa.arrays;


// https://leetcode.com/problems/reverse-words-in-a-string-iii/
// Time - O(N), Space - O(N)
public class ReverseWords {

    public String reverseWords(String s) {

        if( s.length() == 1)
            return s;

        // character reverse whole string 
        char[] sArray = s.toCharArray();
        for(int i = 0, j = s.length() - 1; i < j ; i++, j--){
            char temp =  sArray[i];
            sArray[i]= sArray[j];
            sArray[j] = temp;
        }

         s = String.valueOf(sArray);

         String[] words = s.split(" ");
         for(int i = 0, j = words.length - 1; i < j; i++, j--){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
         }

         return String.join(" ", words);


        
    }

}
