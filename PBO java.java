import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;

        do {
            int awal, akhir;

            System.out.print("Masukkan Batas atas: ");
            awal = input.nextInt();

            System.out.print("Masukkan Batas Akhir: ");
            akhir = input.nextInt();

            System.out.println("Bilangan genap dalam rentang " + awal + " hingga " + akhir + " adalah:");

            // Menampilkan bilangan genap
            for (int num = awal; num <= akhir; num++) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }

            System.out.println();

            System.out.print("Apakah Anda ingin mengisi data lagi? (y/n): ");
            ulangi = input.next().charAt(0);

        } while (ulangi == 'y' || ulangi == 'Y');

        System.out.println("Thank You");
    }
}
