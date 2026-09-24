import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap thu nhap hang nam (dong): ");
        long thuNhap = scanner.nextLong();

        if (thuNhap < 0) {
            System.out.println("Thu nhap khong duoc am.");
            scanner.close();
            return;
        }

        long[] gioiHanTren = {
            5_000_000L,
            10_000_000L,
            18_000_000L,
            32_000_000L,
            52_000_000L,
            80_000_000L,
            Long.MAX_VALUE
        };

        double[] thueSuat = {
            0.05, 0.10, 0.15, 0.20, 0.25, 0.30, 0.35
        };

        long gioiHanDuoi = 0;
        double tongThue = 0;

        System.out.println("Thue theo tung muc:");

        for (int i = 0; i < gioiHanTren.length; i++) {
            if (thuNhap <= gioiHanDuoi) {
                break;
            }

            long thuNhapTrongMuc =
                Math.min(thuNhap, gioiHanTren[i]) - gioiHanDuoi;

            double thueTrongMuc = thuNhapTrongMuc * thueSuat[i];
            tongThue += thueTrongMuc;

            System.out.printf(
                "Muc %d (%.0f%%): %,d dong x %.0f%% = %,.0f dong%n",
                i + 1,
                thueSuat[i] * 100,
                thuNhapTrongMuc,
                thueSuat[i] * 100,
                thueTrongMuc
            );

            gioiHanDuoi = gioiHanTren[i];
        }

        System.out.printf("Tong thue phai tra: %,.0f dong%n", tongThue);

        scanner.close();
    }
}