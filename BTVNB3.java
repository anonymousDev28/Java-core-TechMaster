import java.util.Scanner;

public class BTVNB3 {
    public static Scanner sc = new Scanner(System.in);

    public static void countCharE() {
        String str = "Hello every one";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
                System.out.println("kí tự e thứ " + count + " có index = " + i);
            }
        }
        System.out.println("kí tự e xuất hiện " + count + " lần");
    }

    public static void bangCuuChuong() {
        char choose = 'N';
        do {
            int n;
            do {
                System.out.println("Nhập một số nguyên trong đoạn [0;9]");
                n = sc.nextInt();
            } while (n < 0 || n > 9);

            System.out.println("=============Bảng Cửu Chương của " + n + "===========");
            for (int i = 0; i < 10; i++) {
                System.out.println("n x " + i + " = " + (n * i));
            }
            do {
                System.out.println("Do you wanna continues?(Y/N)");
                choose = sc.next().charAt(0);
            } while (choose != 'Y' && choose != 'N');
        }
        while (choose == 'Y');

    }
    public static void main(String[] args) {
        countCharE();
        bangCuuChuong();
    }
}
