/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhom6;

/**
 *
 * @author adminh
 */
public class NHOM6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn chức năng:");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");
        System.out.println("5. Nhập vào số nguyên và in ra các số lẻ");

        System.out.print("Nhập lựa chọn của bạn (1-5): ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 4) {
            System.out.print("Nhập số thứ nhất: ");
            int a = scanner.nextInt();
            System.out.print("Nhập số thứ hai: ");
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
}
