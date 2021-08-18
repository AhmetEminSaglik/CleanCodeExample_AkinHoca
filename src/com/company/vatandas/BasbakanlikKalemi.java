package com.company.vatandas;

public class BasbakanlikKalemi {
    Basbakan basbakan;

    public BasbakanlikKalemi(Basbakan basbakan) {
        this.basbakan = new VekilBasbakan(basbakan);
    }

    public Basbakan banaBaskaniVer() {
        System.out.println("Baskanlik Kalemi : tabi efendim");
        return basbakan;

    }

}
