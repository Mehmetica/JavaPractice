package BankaUyg;

import java.util.Random;

public class YeniUyelik extends UyelikIslemleri {
    public YeniUyelik(Musteri musteri) {
        super();

    }

    Musteri musteri = new Musteri();

    public boolean islemYap() {

        System.out.print("Lutfen adinizi giriniz: ");
        musteri.setMusteriAdi(scan.next());

        System.out.print("Lutfen soyadinizi giriniz: ");
        musteri.setMusteriSoyadi(scan.next());

        System.out.println("Parolaniz en az 1 buyuk harf,1 kucuk harf,1 sayi,1 ozel karakter icermeli ve en az 8 karakterden olusmalidir.");
        System.out.println("Ornegin : \" Mehmet123*\" ");

        System.out.print("Lutfen parolanizi giriniz: ");
        String parola1 = scan.next();

        System.out.print("Lutfen parolanizi tekrar giriniz: ");
        String parola2 = scan.next();
        while (!parola1.equals(parola2)){
            System.out.println("Girilen parolalar uyusmuyor.Lutfen tekrar deneyiniz.");
            System.out.print("Lutfen parolanizi giriniz: ");
             parola1 = scan.next();
            System.out.print("Lutfen parolanizi tekrar giriniz: ");
             parola2 = scan.next();
        } musteri.setParola(parola1);

        System.out.print("Lutfen TC Kimlik No'nuzu giriniz: ");
        musteri.setTC_No(scan.nextInt());


        Random random = new Random();

        musteri.setHesapNo(random.nextInt(Integer.MAX_VALUE-1)+1);
        System.out.println("Hesap numaraniz: "+ musteri.getHesapNo());



        //Bankacilik islemleri menusu gösterilir

        return true;

    }


}
