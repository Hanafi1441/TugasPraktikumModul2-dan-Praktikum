package com.alyaauliahanafi.modul2.Nomor1.Nomor2;

public class Ikan extends  Binatang{//mewarisi class binatang
    //deklarasi
    public String nama;
    public String berenang;
    //method
    public void getNama(){
        System.out.println("Nama Ikan\t\t:"+nama);
    }
    public void setBerenang(){
        System.out.println("Mobilitas\t\t:"+berenang);
    }
}
