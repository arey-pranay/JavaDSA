import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String k = "";
        int maxi = 0;

        for (int j = 0; j < s.length(); j++) {
            int found = k.indexOf(s.charAt(j));
            if (found == -1) {
                k += s.charAt(j);
                int t = k.length();
                maxi = Math.max(t, maxi);
            } else {
                int o = k.length();
                maxi = Math.max(o, maxi);
                k = k.substring(found + 1);
                k += s.charAt(j);
            }
        }
        return maxi;
    }
}
