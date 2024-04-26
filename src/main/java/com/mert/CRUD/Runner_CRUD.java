package com.mert.CRUD;

import com.mert.CRUD.entity.Urun;
import com.mert.CRUD.repository.MusteriRepository;
import com.mert.CRUD.repository.UrunRepository;

import java.util.Scanner;

public class Runner_CRUD {
    /**
     * Entity kısmında ürün ve musteri class'larını oluşturduk.
     * Sonrasında repository package kısmında gerekli methodları yazdık
     * Şimdi bu repo ile gerekli ekleme, silme işlemlerini yapabiliriz
     */
    public static void main(String[] args) throws Exception{
        UrunRepository urunRepository = new UrunRepository();
        MusteriRepository musteriRepository = new MusteriRepository();
        System.out.println("""
                *******
                1- Ürün Ekle
                2- Ürün Sil
                3- Ürün Güncelle
                4- Ürünleri Listele
                5- Müşteri id sil
                6- Müşteri Listele
                7- Müşteri Ekle
                0- Ç I K I Ş
                """);
        System.out.print("Seçiniz: ");
        int secim = new Scanner(System.in).nextInt();
        if(secim ==1){
            System.out.println("Ürün adı: ");
            String urunAdi = new Scanner(System.in).nextLine();
            System.out.println("Ürün Fiyatı: ");
            double urunFiyatı = new Scanner(System.in).nextDouble();
            System.out.println("Ürün Açıklaması: ");
            String aciklama = new Scanner(System.in).nextLine();
            urunRepository.save(new Urun(0L,3L,urunAdi,urunFiyatı,aciklama,"http:"));
        }

        // Devamı yapılabilir......  if else ile....
    }
}
