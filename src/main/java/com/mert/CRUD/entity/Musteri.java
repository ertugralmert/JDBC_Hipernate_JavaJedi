package com.mert.CRUD.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //
@AllArgsConstructor //
@NoArgsConstructor // parametreli constructor ların tümü
@Builder //default constructor
public class Musteri {
    Long id;
    String ad;
    String soyad;
    String tcno;
    String adres;
    String telefon;


}
