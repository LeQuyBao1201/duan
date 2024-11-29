/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhom6;

import java.util.Scanner;

/**
 *
 * @author adminhádnlaknl
 */
public class NHOM6 {
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Chon chuc nang:");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");
        System.out.println("5. Nhập vào số nguyên và in ra các số lẻ");
        System.out.println("6. nhap vao so nguyen va in ra cac so chan");
        System.out.println("7. nhap vao so nguyen va in ra cac so chia het cho 5");
        System.out.println("8. nhap vao so nguyen va in ra cac so chia het cho 10");
        System.out.print("Nhập lựa chọn của bạn (1-5): ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 4) {
            System.out.print("Nhap so thu nhat: ");
            int a = scanner.nextInt();
            System.out.print("Nhap so thu hai: ");
            int b = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Kết quả: " + cong(a, b));
                    break;
                case 2:
                    System.out.println("Kết quả: " + tru(a, b));
                    break;
                case 3:
                    System.out.println("Kết quả: " + nhan(a, b));
                    break;
                case 4:
                    System.out.println("Kết quả: " + chia(a, b));
                    break;
            }
        } else if (choice == 5) {
            System.out.print("Nhập một số nguyên: ");
            int n = scanner.nextInt();
            inSoLe(n);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }

        scanner.close();


    }
    //phwp cong
    
     public static int cong(int a, int b) {
        return a + b;
     }
   // phep tru
    public static int tru(int a, int b) {
        return a - b;
    }
    // phep nhan
    public static int nhan(int a, int b) {
        return a * b;
    }

    // phep chia
    public static String chia(int a, int b) {
        if (b == 0) {
            return "Không thể chia cho 0!";
        }
        return String.valueOf((double) a / b);
    }


    public static void inSoLe(int n) {
        System.out.print("Các số lẻ từ 0 đến " + n + " là: ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
