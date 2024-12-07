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
        System.out.println("6. Nhập vào số chan và in ra các số chan");
        System.out.println("7. Nhập vào số le và in ra các số lẻ");
        System.out.println("8. Nhập vào số nguyên và in ra các số lẻ");
        System.out.println("9 Nhập tên cần xóa ");
        System.out.println("10. nhap vao so nguyen va in ra cac so chia het cho 5");
        System.out.println("11. Nhập vào số le và in ra các số lẻ");
        System.out.println("12. Nhập tuổi và cân nặng");
        System.out.println("13. Nhập chiều dài chiều rộng tính chu vi");
        System.out.println("14. Nhập chiều dài chiều rộng tính dien tich");
        System.out.println("14. Nhập chiều dài chiều rộng chieu cao tính the tich");
        System.out.print("Nhập lựa chọn của bạn (1-20): ");

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

                case 9:
                    System.out.print("Nhập tên cần xóa: ");
                    String nameToDelete = scanner.next();
                    System.out.println("Tên cần xóa là: " + nameToDelete);
                    break;
                   
                case 10:
                    int number = scanner.nextInt();
        
                    System.out.println("Các số chia hết cho 5 từ 1 đến " + number + " là:");
                    
                    // Duyệt và in các số chia hết cho 5
                    for (int i = 1; i <= number; i++) {
                        if (i % 5 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    case 11:
                    System.out.println("Nhập vào một số lẻ:");

                    int number = scanner.nextInt();
            
                    // Kiểm tra xem số nhập vào có phải là số lẻ không
                    if (number % 2 == 0) {
                        System.out.println("Số vừa nhập không phải là số lẻ. Vui lòng thử lại.");
                    } else {
                        System.out.println("Các số lẻ từ 1 đến " + number + " là:");
                        for (int i = 1; i <= number; i += 2) {
                            System.out.print(i + " ");
                        }
                    }
            
                    scanner.close();
                    break;
                    case 21:
                    System.exit(0);
                    default:


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
    // phwp cong

    public static int cong(int a, int b) {
        return a + b;
    }
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

    System.out.print(" thanh ");
}
