package BankaUyg;

public class UyeGirisi extends UyelikIslemleri {
    public UyeGirisi(Musteri musteri) {
        super();
    }

    Musteri musteri = new Musteri();

    public boolean islemYap() {
        System.out.print("Lutfen adinizi giriniz: ");
        musteri.setMusteriAdi(scan.next());

        System.out.print("Lutfen soyadinizi giriniz: ");
        musteri.setMusteriSoyadi(scan.next());

        System.out.print("Lutfen parolanizi giriniz: ");
        String parola = scan.next();

//hosgeldiniz sayın ....  yapmak istediğiniz işlem nedir?
        /*
        1.para çek
        2.para yatır
        3.para gönder(kayıtlı kişilere eklensin mi?) ıban ile- hesap no ile
        4.kredi çek
        5.fatura öde
        6.son işlemler ???
        7.ana menüye dön
        */
        System.out.println("Hosgeldiniz sayın "+ musteri.getMusteriAdi()+" "+musteri.getMusteriSoyadi());
        System.out.println("Lutfen yapmak istediginiz islemi seciniz: ");
        System.out.println("1. Para cekme");
        System.out.println("2. Para yatirma");
        System.out.println("3. Kredi kartı odeme");
        System.out.println("4. Fatura odeme");
        System.out.println("5. GSM TL/paket yukleme");
        System.out.println("6. Ana menuye donme");
        int secim = scan.nextInt();
        while (secim<1 || secim>6){
            System.out.println("Yanlis giris yaptiniz.Lutfen tekrar deneyiniz.");
            secim= scan.nextInt();
        }
        BankacilikIslemleri bankacilikIslemleri = new BankacilikIslemleri();

        switch (secim){
            case 1 : bankacilikIslemleri.paraCekme();
            break;


            default: bankacilikIslemleri.paraCekme();
        }

        return true;
    }
}
