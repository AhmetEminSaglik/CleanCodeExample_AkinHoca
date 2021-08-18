package com.company.vatandas;

public class Vatandas {
    private Basbakan basbakan;

    public Vatandas(BasbakanlikKalemi kalem) {
        basbakan = kalem.banaBaskaniVer();
    }

    public void derdiniAnlat() {
        basbakan.dertdinle("Karnim ac Basbakanim");
    }

    public void isIste() {
        basbakan.isBul("oglum");

    }
}
