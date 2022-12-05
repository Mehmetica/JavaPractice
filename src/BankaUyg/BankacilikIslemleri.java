package BankaUyg;

import java.util.Random;
import java.util.Scanner;

public class BankacilikIslemleri {
    Scanner scan = new Scanner(System.in);


    Musteri musteri;

    Random random = new Random();
    public boolean islemYap(){
        return true;
    }


    public void paraTransferi(Musteri gonderici, Musteri alici, float miktar) {
        if (gonderici.getBakiye() <= 0 || gonderici.getBakiye() < miktar) {
            System.out.println("Bakiyeniz bu islem icin yetersizdir!");
            return;
        } else {
            gonderici.setBakiye(gonderici.getBakiye() - miktar);
            alici.setBakiye(gonderici.getBakiye() + miktar);

            System.out.println(gonderici.getHesapNo() + " nolu TL hesabinizdan " + alici.getHesapNo() + " nolu hesaba " + miktar +
                    " TL para transferi gerceklesmistir.\nTransfer sonrasi bakiyeniz: " +
                    gonderici.getBakiye());
        }

    }


    public void paraYatirma() {
        System.out.println("Ne kadar para yatirmak istersiniz?");
        float yatirilan = scan.nextFloat();
        musteri.setBakiye(+yatirilan);
        System.out.println("Guncel paraniz :" + musteri.getBakiye());


    }

    public void paraCekme() {
        System.out.println("Ne kadar para cekmek istersiniz?");
        float cekilen = scan.nextFloat();
        if (cekilen > musteri.getBakiye()) {
            System.out.println("Bakiye yetersiz!");
            return;
        } else {
            musteri.setBakiye(-cekilen);
            System.out.println("Para cekme islemi basarili.Guncel bakiyeniz: " + musteri.getBakiye());
        }
    }

    public void gosterme() {//düzenlenecek

        System.out.println("Hesap No:" + musteri.getHesapNo());
        System.out.println("Guncel Bakiye:" + musteri.getBakiye());
    }



    public int hesapNoTuretme(int r) {
        Database database = new Database();

        while (database.hesapNoList.contains(r)) {
            r = random.nextInt(Integer.MAX_VALUE-1) + 1;

        }
        return r;



    }


}
