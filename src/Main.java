import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz : ");
        int mat = scanner.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        int fizik = scanner.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        int kimya = scanner.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        int turkce = scanner.nextInt();

        System.out.print("Tarih notunu giriniz : ");
        int tarih = scanner.nextInt();

        System.out.print("Müzik notunu giriniz : ");
        int muzik = scanner.nextInt();

        double avg = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Avg : " + avg);

        boolean passedOrFailed = avg >= 60;

        String passed = "Sınıfı geçti";
        String failed = "Sınıfta kaldı";

        System.out.println(passedOrFailed ? passed : failed);

    }
}
