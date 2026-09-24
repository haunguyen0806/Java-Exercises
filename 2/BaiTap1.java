import java.util.Scanner;

public class BaiTap1 {
    public static double tinhThue(double thuNhap) {
        double thue = 0;
        
        if (thuNhap <= 5) {
            thue = thuNhap * 0.05;
        } else if (thuNhap <= 10) {
            thue = 5 * 0.05 + (thuNhap - 5) * 0.10;
        } else if (thuNhap <= 18) {
            thue = 5 * 0.05 + 5 * 0.10 + (thuNhap - 10) * 0.15;
        } else if (thuNhap <= 32) {
            thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + (thuNhap - 18) * 0.20;
        } else if (thuNhap <= 52) {
            thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + (thuNhap - 32) * 0.25;
        } else if (thuNhap <= 80) {
            thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + (thuNhap - 52) * 0.30;
        } else {
            thue = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + 28 * 0.30 + (thuNhap - 80) * 0.35;
        }
        
        return thue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thu nhap hang nam (trieu dong): ");
        double thuNhap = scanner.nextDouble();
        
        double tongThue = tinhThue(thuNhap);
        System.out.println("So thue phai tra: " + tongThue + " trieu dong");
        scanner.close();
    }
}