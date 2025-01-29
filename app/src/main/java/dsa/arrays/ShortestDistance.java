package dsa.arrays;

public class ShortestDistance {

    public int shortestDistance(String[] words, String word1, String word2) {
        // Write your code herea

        int word1Index = -1;  
        int word2Index = -1;  
        int shortestDistance = Integer.MAX_VALUE;  
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1)){
                word1Index = i;
            }
            if(words[i].equals(word2)){
                word2Index = i;
            }
            if(word1Index != -1 &&  word2Index != -1)
                 shortestDistance = Math.min(shortestDistance, Math.abs(word1Index - word2Index));
        }

        return shortestDistance;

    }

}
