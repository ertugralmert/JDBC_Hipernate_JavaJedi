package com.mert.CRUD.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //
@AllArgsConstructor //
@NoArgsConstructor // parametreli constructor ların tümü
@Builder //default constructor
public class Urun {
    /**
     * lombok adında bir websitesi var. Getter SEtter ve bir çok işlemler için
     * bu siteyi implement ederek clean code özelliğini kullanabiliriz.
     * https://projectlombok.org/ ancak maven sitesini kullanmak daha işimize yarar.
     * https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.32
     * // https://mvnrepository.com/artifact/org.projectlombok/lombok
     * compileOnly group: 'org.projectlombok', name: 'lombok', version: '1.18.32'
     * Aynı şekilde build.gradle içine implement ediyoruz.
     * şu şekil olacak
     * compileOnly group: 'org.projectlombok', name: 'lombok', version: '1.18.32'
     *     // https://mvnrepository.com/artifact/org.projectlombok/lombok
     *     annotationProcessor group: 'org.projectlombok', name: 'lombok', version: '1.18.32'
     */
    Long id;
    Long kategori_id;
    String ad;
    Double fiyat;
    String aciklama;
    String resim;


}
