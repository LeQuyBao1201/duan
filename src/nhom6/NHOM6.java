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
        System.out.println("Chọn chức năng:");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");
        System.out.println("5. Nhập vào số le và in ra các số lẻ");
        System.out.println("6. Nhập vào số thực và in ra các số thuc");
        System.out.println("7. Nhập vào số hữu tỉ  và in ra các số huu ti");
        System.out.print("Nhập lựa chọn của bạn (1-7): ");
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

                    case 5:
                        System.out.println("nhập một số nguyên" );
                        int n = scanner.nextInt();
                        System.out.println("Các số lẻ :");
                        for (int i = 1; i <= n; i += 2) System.out.print(i + " ");
                    System.out.println();
                    break;
                    case 6:
                        scanner.nextInt();
                        System.out.println("Nhập tên cần xóa");
                        System.out.println("Tên \""+ scanner.nextInt() + "\" đã được xóa (giả lập).");
                        break;
                    
             
                    case 7:
                         System.out.println("Nhập một số nguyên để tính giai thừa:");
                         int num = scanner.nextInt();
                         long factorial = 1;
                         for (int i = 1; i <= num; i++) {
                             factorial *= i;
                         }
                         System.out.println("Giai thừa của " + num + " là: " + factorial);
                         break;
                    case 8:
                          System.out.println("Nhập một số nguyên để kiểm tra số nguyên tố:");
                          int primeCheck = scanner.nextInt();
                          boolean isPrime = true;
                          if (primeCheck <= 1) {
                              isPrime = false;
                          } else {
                              for (int i = 2; i <= Math.sqrt(primeCheck); i++) {
                                  if (primeCheck % i == 0) {
                                      isPrime = false;
                                      break;
                                  }
                              }
                          }
    
                    break;
                    case 21:
                    System.exit(0);
                    default:
                    System.out.println("chon sai chuc nang vui long chon lai");
                    

                       


            }
        } else if (choice == 5) {
            System.out.print("Nhập một số nguyên: ");
            int n = scanner.nextInt();
            inSoLe(n);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }

        scanner.close();đswd

    }
    // phwp cong

    public static int cong(int a, int b) {
        return a + b;

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
}