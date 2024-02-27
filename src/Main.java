import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını girin: ");
        int basamakSayisi = scanner.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j = basamakSayisi; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
