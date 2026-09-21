import java.util.Scanner;

public class PenilaianHurufMutu {
    public static void main(String[] args) {
        System.out.println("Penilaian Huruf Mutu");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai (0-100): ");
        int nilai = scanner.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid!");
        } else if (nilai >= 85) {
            System.out.println('A');
        } else if (nilai >= 70 && nilai < 85) {
            System.out.println('B');
        } else if (nilai >= 55 && nilai < 70) {
            System.out.println('C');
        } else if (nilai >= 40 && nilai < 55) {
            System.out.println('D');
        } else {
            System.out.println('E');
        }
    }
}
