package com.company.vatandas;

public class GercekBasbakan implements Basbakan {
    @Override
    public void dertdinle(String dert) {
        System.out.println("Basbakan dinliyorum");
    }

    @Override
    public void isBul(String text) {
        System.out.println("Basbakan  : Bana boyle isteklerle gelmeyin");
    }


}
