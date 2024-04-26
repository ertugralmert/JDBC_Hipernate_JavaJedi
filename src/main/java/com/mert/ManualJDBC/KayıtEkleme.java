package com.mert.ManualJDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class KayıtEkleme {
    public static void main(String[] args) throws Exception {

        // Description_JDBC_Connection class'ta anlattıklarımı gösterir.

        Driver.class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/SatisDB";
        String username = "postgres";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        String SQL = "insert into tblurun (urunadi,fiyat,aciklama) values ('kola',10,'BEKLEMEDE')";
        PreparedStatement preparedStatement = connection.prepareCall(SQL);
        preparedStatement.executeUpdate();
        connection.close();
        System.out.println("bağlantı kapatıldı");
    }
}
