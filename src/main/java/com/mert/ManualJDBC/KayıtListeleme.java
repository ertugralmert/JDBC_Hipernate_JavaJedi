package com.mert.ManualJDBC;

import java.sql.*;

public class KayıtListeleme {
    // burası biraz önemli
    // Benzer yapıyı burada da oluşturuyoruz.

    public static void main(String[] args) throws Exception {
        Driver.class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/SatisDB";
        String username = "postgres";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        String SQL = "select * from tblurun";
        PreparedStatement preparedStatement = connection.prepareCall(SQL);
        // DİKKKAATT!!! burada executeUpdate yerine execute Query kullanıyoruz
        // ancak bu executeQueary ResultSet ' e dönüştürmemiz lazım

       ResultSet resultSet = preparedStatement.executeQuery();
        /**
         * Eğer result set içinde gelen dataları üzerinde gezinmek istersek
         * tüm satırları tek tek gezmemiz gerekecektir.
         * Bu işlemi yapmak için ise bir döngü kullanılabilir.
         * Özellikle while döngüsü burada işimize yarar.
         * Satırlar arası geçiş yapmak için next() methodu kullanılır.
         */

//        // bu tek bir çıktı almamızı sağlar o yüzden yorum satırın tutuyorum.
//        resultSet.next();
//        String urunAdi = resultSet.getString("ad");
//        double urunFiyatı = resultSet.getDouble("fiyat");
//        System.out.println("Ürün adı: ".concat(urunAdi));
//        System.out.println("Ürün fiyatı: ".concat(String.valueOf(urunFiyatı)));

        while(resultSet.next()){
            String urunAdi = resultSet.getString("ad");
            double urunFiyatı = resultSet.getDouble("fiyat");
            System.out.println("Ürün adı: ".concat(urunAdi));
            System.out.println("Ürün fiyatı: ".concat(String.valueOf(urunFiyatı)));
            System.out.println("-----------------");
        }
        connection.close();
        System.out.println("bağlantı kapatıldı");


    }

    /**
     * > Task :KayıtListeleme.main()
     * Ürün adı: deneme2
     * Ürün fiyatı: 34000.0
     * -----------------
     * Ürün adı: Canon Pixima 322
     * Ürün fiyatı: 8500.0
     * -----------------
     * Ürün adı: Hp A122
     * Ürün fiyatı: 1300.0
     * -----------------
     * Ürün adı: Asrock Anakart
     * Ürün fiyatı: 5400.0
     * -----------------
     * Ürün adı: Intel Xeon Islemci
     * Ürün fiyatı: 4200.0
     * -----------------
     * Ürün adı: Kiingstone Ram 128Gb
     * Ürün fiyatı: 19000.0
     * -----------------
     * Ürün adı: Samsung EVO 1Tb
     * Ürün fiyatı: 32000.0
     * -----------------
     * Ürün adı: ViewSonic 32 inch
     * Ürün fiyatı: 5433.0
     * -----------------
     * Ürün adı: Monitor Askı Aparatı
     * Ürün fiyatı: 870.0
     * -----------------
     * Ürün adı: HDMI kablo
     * Ürün fiyatı: 250.0
     * -----------------
     * Ürün adı: Kablosuz Modem Yükseltici
     * Ürün fiyatı: 2250.0
     * -----------------
     * Ürün adı: Iphone 15 Pro Max 1Tb
     * Ürün fiyatı: 102000.0
     * -----------------
     * Ürün adı: Samsung S24 Pro
     * Ürün fiyatı: 76000.0
     * -----------------
     * Ürün adı: Redmi Note 13
     * Ürün fiyatı: 22500.0
     * -----------------
     * Ürün adı: Oppo
     * Ürün fiyatı: 16000.0
     * -----------------
     * Ürün adı: Samsung A7
     * Ürün fiyatı: 24900.0
     * -----------------
     * Ürün adı: Samsung Note 10
     * Ürün fiyatı: 34500.0
     * -----------------
     * Ürün adı: Appe Watch 9
     * Ürün fiyatı: 19999.0
     * -----------------
     * Ürün adı: Samsung
     * Ürün fiyatı: 10999.0
     * -----------------
     * Ürün adı: Sony 82 inch
     * Ürün fiyatı: 77999.0
     * -----------------
     * Ürün adı: Samsung 8K Ultra
     * Ürün fiyatı: 122999.0
     * -----------------
     * Ürün adı: Toshiba 42 inch fullHD
     * Ürün fiyatı: 14999.0
     * -----------------
     * Ürün adı: Samsung 3D 50 inch
     * Ürün fiyatı: 34500.0
     * -----------------
     * Ürün adı: JBL ultra sound perfect
     * Ürün fiyatı: 19999.0
     * -----------------
     * Ürün adı: Sony fullHD outside
     * Ürün fiyatı: 29999.0
     * -----------------
     * Ürün adı: LG compact 1200 lümen
     * Ürün fiyatı: 14000.0
     * -----------------
     * Ürün adı: Acer 720p
     * Ürün fiyatı: 4599.0
     * -----------------
     * Ürün adı: Apple Watch Ultra
     * Ürün fiyatı: 39500.0
     * -----------------
     * Ürün adı: MertUrunu
     * Ürün fiyatı: 99999.0
     * -----------------
     * Ürün adı: Laptop i90
     * Ürün fiyatı: 0.0
     * -----------------
     * bağlantı kapatıldı
     */


}
