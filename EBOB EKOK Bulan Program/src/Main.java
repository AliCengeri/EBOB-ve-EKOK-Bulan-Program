import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();
        int i = a;
        if (a > b) {
            while (i <= a) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println("EBOB: " + i);
                    break;
                }
                i--;
            }
        } else {
            while (i <= a) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println("EBOB: " + i);
                    break;
                }
                i--;

            }
        }
        int k = 1;
        while (k <= (a * b)) {
            if (k % a == 0 && k % b == 0) {
                System.out.println("EKOK: " + k);
                break;
            }
            k++;
        }
    }
}