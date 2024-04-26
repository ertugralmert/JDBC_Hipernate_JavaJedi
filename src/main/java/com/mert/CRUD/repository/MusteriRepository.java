package com.mert.CRUD.repository;

import com.mert.CRUD.CRUD_CreateReadUpdateDelete;
import com.mert.CRUD.entity.Musteri;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MusteriRepository {

    private  final CRUD_CreateReadUpdateDelete crud;
    private ResultSet resultSet;
    public MusteriRepository(){
        this.crud = new CRUD_CreateReadUpdateDelete("SatisDB");
    }
    public void save(Musteri musteri) throws  Exception{
        String sql = "insert into tblmusteri(ad,soyad,tcno,adres,telefon) values('"+musteri.getAd()+
                "','"+musteri.getSoyad()+"','"+musteri.getTcno()+"','"+musteri.getAdres()+"','"+musteri.getTelefon()+"')";
        crud.executeUpdate(sql);
    }

    public void update(Musteri musteri) throws Exception{
        String sql = "update tblmusteri set ad='"
                +musteri.getAd()+"',soyad='"
                +musteri.getSoyad()+"'tcno='"
                +musteri.getTcno()+"'telefon='"
                +musteri.getTelefon()+"'where id="+musteri.getId();
        crud.executeUpdate(sql);
    }
    public void delete(Long id) throws  Exception{
        String deleteSQL = "delete from tblmusteri where id="+id;
        crud.executeUpdate(deleteSQL);
    }

    public List<Musteri> findAll() throws Exception{
        List<Musteri> musteriList = new ArrayList<>();
        String sql = "select * from tblmusteri";
        resultSet = crud.executeQuery(sql);
        while (resultSet.next()){
            Long id = resultSet.getLong("id");
            String ad = resultSet.getString("ad");
            String soyad= resultSet.getString("soyad");
            String tcno = resultSet.getString("tc");
            String adres = resultSet.getString("adres");
            String telefon = resultSet.getString("telefon");
            Musteri musteri = new Musteri(id,ad,soyad,tcno,adres,telefon);
            musteriList.add(musteri);
        }
        return musteriList;
    }


}
