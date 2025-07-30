package Day18;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class LeetCode3_LongestSubstringWithoutRepet {


    public static void main(String[] args) {
        String s = "mynamehello";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int Maxlen = 0;
        int left = 0;
        int n = s.length();

        Set<Character> seen = new HashSet<>();
        for (int right = 0; right < n; right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            Maxlen = Math.max(Maxlen, right - left + 1);
        }
        return Maxlen;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int maxLen = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (seen.contains(s.charAt(j))) {
                    break;
                }
                seen.add(s.charAt(j));
                count = seen.size();
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }

}
