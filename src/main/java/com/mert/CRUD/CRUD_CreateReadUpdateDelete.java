package com.mert.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CRUD_CreateReadUpdateDelete {
    // Burada tüm gerekli kısımları yazıp JDBC yi ayarlayıp bundan sonra istediğimiz islemleri yapabiliriz.

    /**
     * Gerekli olanları öğrenmiştik
     * Connection, PreparedStatement, ResultSet
     * url, username, password
     * databasename
     */
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private String url = "jdbc:postgresql://localhost:5432/";
    private String username = "postgres";
    private String password = "root";
    private String databaseName;

    // constructor oluşturduk databasename alabilmek için
    public CRUD_CreateReadUpdateDelete(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * DB'ye bağlanabilmek için connection oluşturuyoruz ve kontrol ediyoruz
     * @return
     */
    public boolean openConnection() {
        try {
            connection = DriverManager.getConnection(url.concat(databaseName), username, password);
            return true;
        } catch (Exception e) {
            System.out.println("Bağlantı kurulamadı");
            return false;
        }
    }

    /**
     * Bağlanılan DB'den çıkış için oluşturulmuş method
     */
    private void closeConnection() {
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println("Bağlantı kapatılamadı");
        }
    }

    /**
     * Burada DB içinde sql değişkeni ile update, ekleme gibi işlemleri yapıyoruz
     * @param sql
     * @throws Exception
     */
    public void executeUpdate(String sql) throws Exception {
        if (openConnection()) {
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.executeUpdate();
            closeConnection();
        } else {
            System.out.println("Bağlantı kurulamadı");
        }
    }

    /**
     *
     * @param sql listleenecek table burada SQL komutu verilir.
     * @return return ile sonuçlar listelenir
     * @throws Exception
     */
    public ResultSet executeQuery(String sql) throws Exception{
        if(openConnection()){
            preparedStatement = connection.prepareCall(sql);
            resultSet = preparedStatement.executeQuery();
            return resultSet;
        } else {
            System.out.println("Bir hata oluştu");
            return null;
        }
    }
}
