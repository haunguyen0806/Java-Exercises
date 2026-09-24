public class BaiTap2 {
    
    public static int timSoLonThuHai(int[] arr) {
        if (arr == null || arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            boolean hasDifferent = false;
            for (int num : arr) {
                if (num != max1) {
                    hasDifferent = true;
                    if (num > max2) {
                        max2 = num;
                    }
                }
            }
            if (!hasDifferent) {
                return Integer.MIN_VALUE;
            }
        }
        
        return max2;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 3, 4, 5, 0, 2};
        int[] test2 = {10, 5, 10};
        int[] test3 = {3};
        
        System.out.println("Output test 1: " + timSoLonThuHai(test1));
        System.out.println("Output test 2: " + timSoLonThuHai(test2));

        int res3 = timSoLonThuHai(test3);
        if (res3 == Integer.MIN_VALUE) {
            System.out.println("Output test 3: Integer.MIN_VALUE");
        } else {
            System.out.println("Output test 3: " + res3);
        }
    }
}