public class BaiTap3 {
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }
        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }
        int required = t.length();
        int left = 0, right = 0, minLen = Integer.MAX_VALUE, head = 0;
        int count = 0;
        
        while (right < s.length()) {
            char cRight = s.charAt(right);
            if (need[cRight] > 0) {
                count++;
            }
            need[cRight]--;
            right++;
            
            while (count == required) {
                if (right - left < minLen) {
                    minLen = right - left;
                    head = left;
                }
                char cLeft = s.charAt(left);
                need[cLeft]++;
                if (need[cLeft] > 0) {
                    count--;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(head, head + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t)); 
    }
}
