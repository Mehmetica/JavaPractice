package BankaUyg;


import java.util.ArrayList;

public class Database {

    ArrayList<Musteri> musteriDataBase = new ArrayList<>();
    ArrayList<Integer> hesapNoList =  new ArrayList<>();
    public void musteriEkleme(Musteri musteri){

        musteriDataBase.add(musteri);
       hesapNoList.add(musteri.getHesapNo());
    }



}
