package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Findallanagrams {

    public List<Integer> findAnagrams(String s, String p) {
            
        char[] pArray = p.toCharArray();
        Arrays.sort(pArray);
        ArrayList<Integer> result = new ArrayList();
        char[] sArray = s.toCharArray();


        for(int i = 0; i <= s.length() - p.length() ; i++){
            String temp = s.substring(i  , i + p.length()  );
       
            char[] tempArray = temp.toCharArray();
       
            Arrays.sort(tempArray);
         
            int res = Arrays.compare(tempArray,pArray);
          
            if(res == 0) result.add(i);
        }

        return result;
        
    }
    
}
