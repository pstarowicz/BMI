package pl.camp.it.bmi.model;

public class Bmi {
    private int height;
    private int weight;
    private double bmiVal;
    private int id;

    public Bmi() {
    }

    public double calculateBMI(int height, int weight) {
        return ((double) weight) * 1e4 / (((double) height) * ((double) height));
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public double getBmiVal() {
        return bmiVal;
    }

    public int getId() {
        return id;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBmiVal(double bmiVal) {
        this.bmiVal = bmiVal;
    }

    public void setId(int id) {
        this.id = id;
    }
}
