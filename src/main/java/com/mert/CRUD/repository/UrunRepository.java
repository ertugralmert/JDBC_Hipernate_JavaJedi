package com.mert.CRUD.repository;

import com.mert.CRUD.CRUD_CreateReadUpdateDelete;
import com.mert.CRUD.entity.Urun;

import java.security.PublicKey;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UrunRepository {

    // CRUD kullanacağız
    private CRUD_CreateReadUpdateDelete crud;
    private ResultSet resultSet;

    public UrunRepository(){
        this.crud = new CRUD_CreateReadUpdateDelete("SatisDB");

    }
    public void save(Urun urun) throws Exception{
        String sql = "insert into tblurun(ad,aciklama,resim,fiyat,kategori_id) values('"+urun.getAd()+
                "','"+urun.getAciklama()+"','"+urun.getResim()+"','"+urun.getFiyat()+",'"+
                urun.getKategori_id()+")";
        crud.executeUpdate(sql);
    }
    public void delete (Long id) throws Exception{
        String deleteSQL = "delete from tblurun where id="+id;
        crud.executeUpdate(deleteSQL);
    }

    public List<Urun> findAll() throws Exception{
        List<Urun> urunList = new ArrayList<>();
        String sql = "select * from tblurun";
     resultSet =   crud.executeQuery(sql);
     while (resultSet.next()){
         Long id = resultSet.getLong("id");
         String ad = resultSet.getString("ad");
         String aciklama = resultSet.getString("aciklama");
         String resim = resultSet.getString("resim");
         double fiyat = resultSet.getDouble("fiyat");
         Long kategori_id=resultSet.getLong("kategori_id");
         Urun urun = new Urun(id,kategori_id,ad,fiyat,aciklama,resim);
         urunList.add(urun);
     }
     return urunList;
    }
}
