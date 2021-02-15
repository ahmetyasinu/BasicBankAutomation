import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtmOtomasyonu {

    public static void main(String[] args) {
        List<Musteri> kartlar = new ArrayList<>();
        NakitKart nakitKart = new NakitKart("Ahmet Yasin", "Uzun", 00000000000, "Yilmaz", 55555555, Durum.AKTIF, 22222222, 1000.0);
        PremiumKrediKart premiumKrediKart = new PremiumKrediKart("Hasan" , "Yilmaz", 1111111111, "Kaya",
                4444444, Durum.AKTIF, 333333333, 10000.0, "21.10.2021", 100.0, 1);
        KlasikKrediKart klasikKrediKart = new KlasikKrediKart("Huseyin" , "Yilmaz", 222222222, "Kaya",
                5555555, Durum.AKTIF, 444444444, 10000.0, "21.10.2021", 100.0, 1);
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****ATM*****");
        while (true) {
            System.out.println("*****Operation*****");
            if (count == 0) {
                System.out.println("Kartiniz bir nakit karttir.");
                System.out.println("1. Bakiye goruntuleme");
                System.out.println("2. Para cekme");
                System.out.println("3. Para yatirma");
                System.out.println("4. Havale/eft islemi");
                System.out.println("Seciminiz: ");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.printf("Bakiyeniz: %fTL\n", nakitKart.getBakiye());
                } else if (choice == 2) {
                    System.out.println("Cekmek istediginiz miktari giriniz: ");
                    double miktar = scanner.nextDouble();
                    nakitKart.setBakiye(nakitKart.getBakiye() - miktar);
                    System.out.printf("Yeni bakiyeniz: %fTL\n", nakitKart.getBakiye());
                } else if (choice == 3) {
                    System.out.println("Yatirmak istediginiz miktari giriniz: ");
                    double miktar = scanner.nextDouble();
                    nakitKart.setBakiye(nakitKart.getBakiye() + miktar);
                    System.out.printf("Yeni bakiyeniz: %fTL\n", nakitKart.getBakiye());
                } else if (choice == 4) {
                    System.out.println("Havale/eft yapmak istediginiz miktari giriniz: ");
                    double miktar = scanner.nextDouble();
                    nakitKart.setBakiye(nakitKart.getBakiye() - miktar);
                    System.out.printf("Yeni bakiyeniz: %fTL\n", nakitKart.getBakiye());
                }
            } else if (count == 1) {
                System.out.println("Kartiniz bir nakit karttir.");
                System.out.println("1. Ekstre goruntuleme");
                System.out.println("2. Borc odeme");
                System.out.println("3. Nakit avans");
                System.out.println("Seciminiz: ");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.printf("Ekstreniz: %fTL\n", klasikKrediKart.getEkstre());
                } else if (choice == 2) {
                    System.out.println("Odemek istediginiz miktari giriniz: ");
                    double miktar = scanner.nextDouble();
                    klasikKrediKart.setEkstre(klasikKrediKart.getEkstre() - miktar);
                    System.out.printf("Yeni borcunuz: %fTL\n", klasikKrediKart.getEkstre());
                } else if (choice == 3) {
                    System.out.println("Cekmek istediginiz miktari giriniz: ");
                    double miktar = scanner.nextDouble();
                    klasikKrediKart.setEkstre(klasikKrediKart.getEkstre() + miktar);
                    System.out.printf("Yeni ekstreniz: %fTL\n", klasikKrediKart.getEkstre());
                }
            } else if(count == 2) {
                System.out.println("Kartiniz bir premium kredi kartidir.");
                System.out.println("1. Ekstre goruntuleme");
                System.out.println("2. Borc odeme");
                System.out.println("3. Nakit avans");
                System.out.println("Seciminiz: ");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.printf("Ekstreniz: %fTL\n", premiumKrediKart.getEkstre());
                } else if (choice == 2) {
                    System.out.println("Odemek istediginiz miktari giriniz: ");
                    double miktar = scanner.nextDouble();
                    premiumKrediKart.setEkstre(premiumKrediKart.getEkstre() - miktar);
                    System.out.printf("Yeni borcunuz: %fTL\n", premiumKrediKart.getEkstre());
                } else if (choice == 3) {
                    System.out.println("Cekmek istediginiz miktari giriniz: ");
                    double miktar = scanner.nextDouble();
                    premiumKrediKart.setEkstre(premiumKrediKart.getEkstre() + miktar);
                    System.out.printf("Yeni ekstreniz: %fTL\n", premiumKrediKart.getEkstre());
                }
            }
            System.out.println("*****End Operation*****");
            count++;
            if (count == 3)
                count = 0;
        }
    }
}
