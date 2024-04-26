package com.mert.CRUD.repository;

import java.util.List;

public class RepositoryImpl<T,ID> implements Repository<T, ID> {
    // tüm methodlar implement edildi aşağıdaki gibi

    /**
     * Genericte T ve Id olması işimizi kolaylaştırır.
     * ID -> Stringte olabilir, Long'ta olabilir.
     * Java Reflection: Java sınıflarını tersine mühendislik ile okuyabilir.
     *      içerisindeki bilgilere ulaşabilir.
     * Java Annotations: Java kodlarına eklenti ekleyebilir.
     *      -> @Table(name = "tblurun") gibi düşünebiiriz.
     * @param t
     */


    @Override
    public void save(T t) {
        /**
         * tablo adı
         * kolon adları -> değişken adları olarak kullan
         * değerler -> değişenlerin değeri
         *
         */

        // normal şartlarda aşağıdaki gibi bilgilere ihtiyacımız var.
        String SQL = "insert into [TABLE_NAME] ([COLUMN-NAME]) values [VALUE])";

    }

    @Override
    public void saveAll(List<T> t) {

    }

    @Override
    public void update(T t) {

    }

    @Override
    public void delete(T t) {

    }

    @Override
    public T findById(ID id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }
}
