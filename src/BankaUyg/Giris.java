package BankaUyg;

import java.util.Scanner;

public class Giris {
    Scanner scan = new Scanner(System.in);
    Musteri musteri;
    UyelikIslemleri uyelikIslemleri;

    public void anaGiris() {
        musteri=new Musteri();
        while (true) {
            System.out.println();
            System.out.println("MG Banka hosgeldiniz!\nYapmak istediginiz islemi seciniz: ");
            System.out.println("1. Uye Girisi\n2. Yeni Kayit\n3. Cikis");
            int secim = scan.nextInt();

            while (!(secim>0 && secim<=3)) {
                System.out.println("Yanlis giris yaptiniz,tekrar deneyiniz.");
                secim = scan.nextInt();
            }
            switch (secim) {
                case 1://uye girisi
                    uyelikIslemleri = new UyeGirisi(musteri);
                    break;
                case 2://yeni uye kaydi
                    uyelikIslemleri = new YeniUyelik(musteri);
                    break;
                case 3:
                    System.out.println("İyi gunler dileriz. Hoscakalin!");
                    System.exit(0);
                default://uye girisi
                    uyelikIslemleri = new UyeGirisi(musteri);
                    break;
            }
            if (!uyelikIslemleri.islemYap()){
                System.out.println("Yine bekleriz.");
                break;
            }
        }
    }
}
