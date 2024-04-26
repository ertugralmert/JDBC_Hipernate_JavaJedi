package com.mert.CRUD.repository;

import java.util.List;

public interface Repository <T,ID>{
    //burada CRUD kullanabilmek için şablon hazırlıyoruz. Interface ile
    // genericleri eklemeyi unutmamak önemli !!! -> <T,ID>
    void save(T t);
    void saveAll(List<T> t);
    void update(T t);
    void delete (T t);
    T findById(ID id);
    List<T> findAll();

    // bu şablonu örnek olarak göstermek için RepositoryIpml class oluşturuldu önce oraya bakalım

}
