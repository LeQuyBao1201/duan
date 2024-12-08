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
<<<<<<< HEAD
        System.out.println("5. Nhập vào số nguyên và in ra các số lẻ");
<<<<<<< HEAD
        System.out.println("6.Xóa theo tên");
        System.out.println("7.Tính trung bình tổng")
        System.out.println("10.thoat");
        System.out.print("Nhập lựa chọn của bạn (1-10): ");
=======
        System.out.println("8. Nhập vào số nguyên và in ra các số lẻ");
        System.out.println("9 Nhập tên cần xóa ");
        System.out.println("11. nhap vao so nguyen va in ra cac so chia het cho 5");
        System.out.println("12. Tính tổng các số từ 1 đến n ");
        System.out.println("13. Nhập vào số nguyên dương và in ra tổng các số chia hết cho 3");
=======
        System.out.println("5. Nhập vào số nguyên và in ra các số lẻ"); 
        System.out.println("6. Nhập vào số chan và in ra các số chan");
        System.out.println("7. Nhập vào số le và in ra các số lẻ");
        System.out.println("8. Nhập vào số nguyên và in ra các số lẻ");
        System.out.println("9 Nhập tên cần xóa ");
        System.out.println("10. nhap vao so nguyen va in ra cac so chia het cho 5");
        System.out.println("11. Nhập vào số le và in ra các số lẻ");
>>>>>>> d1a5398b2afefabfdd6dad03578ef0cea4734384
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
<<<<<<< HEAD
<<<<<<< HEAD
                        case 7:
                            int n = scanner.nextInt();
                            double[] numbers = new double[n];
                            double sum = 0;
                            for(int i = 0; i<n;i++){
                                System.out.println("nhap cac gia tri"+ (i+1) + " :");
                                  numbers[i] = scanner.nextDouble();
                                    sum += numbers[i];
                            }
                            dobule trungbinh = (n > 0) ? sum / n : 0;
                            System.out.println("tong :"+ sum);
                            System.out.println("trung binh : "+trungbinh);
                            scanner.close();
                    case 10:
                       System.exit(0);
=======
                    
                    case 7:
>>>>>>> 
                        
                        default:
                            System.out.println("chon sai chuc nang vui long chon lai");
=======
>>>>>>> d1a5398b2afefabfdd6dad03578ef0cea4734384

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
