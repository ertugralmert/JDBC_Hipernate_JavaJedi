package com.mert.ManualJDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class KayıtGüncelleme {
    // Description_JDBC_Connection class'ta anlattığım gibi şimdi kayıt güncellemesi yapacağız.
    public static void main(String[] args) throws Exception{
        //throws Exception hatırla!!
        Driver.class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost5432/postgres";
        String username = "postgres";
        String password = "root";

        Connection connection = DriverManager.getConnection(url,username,password);
        String SQL = "update tblurun set aciklama = 'BEKLEMEDE";

        PreparedStatement preparedStatement = connection.prepareCall(SQL);
        preparedStatement.executeUpdate();
        connection.close();
        System.out.println("bağlantı kapatıldı");
    }
}
