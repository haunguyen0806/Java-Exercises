public class BaiTap3 {
    public static String xoaKyTuLap(String s) {
        if (s == null) {
            return null;
        }
        
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256];
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(xoaKyTuLap("programming")); 
        System.out.println(xoaKyTuLap("abca"));     
    }
}
