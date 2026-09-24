public class BaiTap5 {
    public static String layChuCaiDau(String s) {
        if (s == null || s.trim().isEmpty()) {
            return "";
        }
        
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                sb.append(Character.toUpperCase(words[i].charAt(0)));
                if (i < words.length - 1) {
                    sb.append(" ");
                }
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(layChuCaiDau("Xin chào các bạn")); 
        System.out.println(layChuCaiDau("Hello World"));     
    }
}
