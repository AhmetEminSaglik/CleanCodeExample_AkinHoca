package com.company.vatandas;

public class Main {
    public static void main(String[] args) {
        System.out.println("VATANDASLIKKKK BASKANLIK UYGULAMASI");

        Basbakan basbakan = new GercekBasbakan();
        BasbakanlikKalemi kalem = new BasbakanlikKalemi(basbakan);

        Vatandas riza = new Vatandas(kalem);
        riza.derdiniAnlat();
        riza.isIste();
    }
}
