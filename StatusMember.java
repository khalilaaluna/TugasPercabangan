import java.util.Scanner;
public class Skenario2 {
    public static void main(String[] args) {
        System.out.println("Cek Diskon Berdasarkan Status Member ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan status member (Gold, Silver, Bronze, Reguler): ");
        String statusMember = scanner.next();

        if(statusMember.equalsIgnoreCase("Gold")) {
            System.out.println("Diskon 20%");
        } else if (statusMember.equalsIgnoreCase("Silver")) {
            System.out.println("Diskon 15%");
        } else if (statusMember.equalsIgnoreCase("Bronze")) {
            System.out.println("Diskon 10%");
        } else if (statusMember.equalsIgnoreCase("Reguler")) {
            System.out.println("Diskon 0%");
        } else {
            System.out.println("Status member tidak valid!");
        }
    }
}
