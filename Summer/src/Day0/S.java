package Day0;

import java.util.ArrayList;
import java.util.List;

public class S {
    public int lengthOfLongestSubstring(String s){

        List<Character> longest = new ArrayList();

        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                longest.add(s.charAt(i));
            }
        }

        return longest.size();
    }

    public static void main(String[] args) {
        S solution = new S();
        int l = solution.lengthOfLongestSubstring("abcabcbb");
        System.out.println(l);


    }
}

