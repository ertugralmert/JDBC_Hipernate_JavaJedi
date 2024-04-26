package com.mert;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Description_JDBC_Connection {
    /**
     * JDBC kavramı SQL tarafında yapılan işlemleri java ile yapmamızı saglar
     * intellij için jdbc ayarları için
     * https://mvnrepository.com/artifact/org.postgresql/postgresql/42.7.3
     * Burada ilgili graaven veya maven seçip ilgili driver linkini kopyalarız.
     * // https://mvnrepository.com/artifact/org.postgresql/postgresql
     * implementation group: 'org.postgresql', name: 'postgresql', version: '42.7.3'
     * Sonrasında build.gradle için -> depencies kısmına implemenation kısmına kopyalanan link eklenir.
     * Build gradle ile snyc işlemini yaparız.
     */

    public static void main(String[] args) throws Exception {
        // aşağıdaki command kısmında sorun olmaması için "throws exception" yapmalıyız.
        Driver.class.forName("org.postgresql.Driver");
        /**
         * Bağlantı işlemini gerçekleştirmiş olduk.
         * Şimdi connection yapabilmek için postgresql ile bağlantı kurmamız gerekiyor.
         */
        String url = "jdbc:postgresql://localhost:5432/SatisDB"; // port default 5432 olarak ayarlandı
        String username = "postgres"; // postgresql kullanıcı adı
        String password = "root"; // postgresql sifresi

        Connection connection = DriverManager.getConnection(url,username,password);
        // DB'ye verdiğimiz emir hazırlanıyor. Bu adımdan sonra DB üzerinden yapacağımız komut olacak.

        String SQL = "update tblmusteri set adres ='Izmir'"; // tüm adresler izmir olarak değiştirilecek.

        PreparedStatement preparedStatement = connection.prepareCall(SQL);
        preparedStatement.executeUpdate(); // burada çalışma başlar

        // işlemleri kapatmamız gerekecek
        connection.close();
        System.out.println("Bağlantı kapatıldı");


    }

}
