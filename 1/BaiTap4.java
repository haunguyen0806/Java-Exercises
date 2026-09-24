public class BaiTap4 {
    public static int demSoTu(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        String[] words = s.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(demSoTu("Xin chào các bạn")); 
        System.out.println(demSoTu("Hello World"));     
    }
}
