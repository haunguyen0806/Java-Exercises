public class BaiTap1 {
    public static String xoaNguyenAm(String s) {
        if (s == null) {
            return null;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char lowerC = Character.toLowerCase(c);
            if (lowerC != 'a' && lowerC != 'e' && lowerC != 'i' && lowerC != 'o' && lowerC != 'u') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(xoaNguyenAm("Cybersoft")); 
        System.out.println(xoaNguyenAm("hello"));     
    }
}