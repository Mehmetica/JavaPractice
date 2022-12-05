package BankaUyg;

import java.util.Random;
import java.util.Scanner;

public class Musteri  {
    Scanner scan = new Scanner(System.in);
    PasswordValidation passwordValidation = new PasswordValidation();
    private String musteriAdi, musteriSoyadi,parola;
    private int TC_No;
     int hesapNo;
    private float bakiye;
    Random random = new Random();

        Database database = new Database();
        BankacilikIslemleri bi= new BankacilikIslemleri();
    public Musteri(String musteriAdi, String musteriSoyadi,String parola, int TC_No, float bakiye) {
        setBakiye(bakiye);
        setMusteriAdi(musteriAdi);
        setMusteriSoyadi(musteriSoyadi);
        setHesapNo(random.nextInt(Integer.MAX_VALUE-1) + 1);
        setTC_No(TC_No);
        setParola(parola);


    }

    public Musteri() {

    }

    public void setHesapNo(int i) {
        this.hesapNo=bi.hesapNoTuretme(i);
    }
    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        int count = 0;

        do {
            char[] charAd = musteriAdi.toCharArray();
             count = 0;
            for (char c : charAd) {
                if (!Character.isLetter(c)) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.print("Isim ozel karakter veya sayi iceremez.Lutfen tekrar deneyiniz: ");
                musteriAdi = scan.next();
            }


        } while (count != 0);
        this.musteriAdi = musteriAdi;
    }



    public String getMusteriSoyadi() {
        return musteriSoyadi;
    }

    public void setMusteriSoyadi(String musteriSoyadi) {

        int count = 0;

        do {
            char[] charAd = musteriSoyadi.toCharArray();
            count = 0;
            for (char c : charAd) {
                if (!Character.isLetter(c)) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.print("Isim ozel karakter veya sayi iceremez.Lutfen tekrar deneyiniz: ");
                musteriSoyadi = scan.next();
            }


        } while (count != 0);
        this.musteriSoyadi = musteriSoyadi;
    }



    public int getTC_No() {
        return TC_No;
    }

    public void setTC_No(int TC_No) {

        int count = 0;

        do {
            String str = String.valueOf(TC_No);
            char[] charAd = str.toCharArray();
            count = 0;
            for (char c : charAd) {
                if (!Character.isDigit(c)) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.print("TC no harf veya ozel karakter iceremez.Lutfen tekrar deneyiniz: ");
                TC_No= scan.nextInt();
            }


        } while (count != 0);
        this.TC_No = TC_No;
    }

    public int getHesapNo() {
        return hesapNo;
    }




//        int count = 0;
//
//        do {
//            String str = String.valueOf(hesapNo);
//            char[] charAd = str.toCharArray();
//            count = 0;
//            for (char c : charAd) {
//                if (!Character.isDigit(c)) {
//                    count++;
//                }
//            }
//            if (count != 0) {
//                System.out.print("Hesap no harf veya ozel karakter iceremez.Lutfen tekrar deneyiniz: ");
//                hesapNo= scan.nextInt();
//            }
//
//
//        } while (count != 0);


    public float getBakiye() {
        return bakiye;
    }

    public void setBakiye(float bakiye) {
        this.bakiye = bakiye;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        if (!passwordValidation.paswordValidation(parola)){
            System.out.println("Parolaniz en az 1 buyuk harf, 1 kucuk harf, 1 sayi, 1 ozel karakter icermeli, bosluk icermemelidir, en az 9 karakter olmalidir.");

            System.exit(0);

        }else this.parola = parola;


    }

    @Override
    public String toString() {
        return "Musteri{" +
                "musteriAdi='" + musteriAdi + '\'' +
                ", musteriSoyadi='" + musteriSoyadi + '\'' +
                ", TC_No=" + TC_No +
                ", hesapNo=" + hesapNo +
                ", bakiye=" + bakiye +
                '}';
    }


}
