package pl.camp.it.bmi.database;

import pl.camp.it.bmi.model.Bmi;

public class BmiDB {
    private Bmi[] bmis = new Bmi[0];
    public void addBmi(Bmi bmi){
        Bmi[] bmis= new Bmi[this.bmis.length+1];
        for(int i=0; i<this.bmis.length;i++){
            bmis[i]=this.bmis[i];
        }
        bmis[bmis.length-1]=bmi;
        this.bmis=bmis;
    }

    public Bmi[] getBmis() {
        return bmis;
    }
}
