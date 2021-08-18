package com.company.vatandas;

public class VekilBasbakan implements Basbakan {
    Basbakan gercekBasbakan;

    public VekilBasbakan(Basbakan gercekBasbakan) {
        this.gercekBasbakan = gercekBasbakan;
    }

    @Override
    public void dertdinle(String dert) {
        System.out.println("Vekil : derdinizi dinliyorum efendim");
        boolean ayiklandi = ayikla(dert);
        if (ayiklandi) {
            ilet(dert);
        }
    }

    @Override
    public void isBul(String isIsteme) {
        System.out.println("Vekil : isteginizi dinliyorum");
        if(ayikla(isIsteme)){
            gercekBasbakan.isBul(isIsteme);
        }
    }

    private void ilet(String dert) {
        gercekBasbakan.dertdinle(dert);
    }

    boolean ayikla(String dert) {
        return true;
    }
}
