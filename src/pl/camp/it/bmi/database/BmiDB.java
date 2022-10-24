package pl.camp.it.bmi.database;

import pl.camp.it.bmi.model.Bmi;

public class BmiDB {
    private Bmi[] bmis = new Bmi[0];

    public void addBmi(Bmi bmi) {
        Bmi[] bmis = new Bmi[this.bmis.length + 1];
        for (int i = 0; i < this.bmis.length; i++) {
            bmis[i] = this.bmis[i];
        }
        bmis[bmis.length - 1] = bmi;
        this.bmis = bmis;
    }

    public boolean checkID(int id) {
        for (int i = 0; i < bmis.length; i++) {
            if (bmis[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    public Bmi searchBmi(int id) {
        for (Bmi i : bmis) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public Bmi[] getBmis() {
        return bmis;
    }
}
