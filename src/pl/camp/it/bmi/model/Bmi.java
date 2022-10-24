package pl.camp.it.bmi.model;

public class Bmi {
    private int height;
    private int weight;
    private double bmiVal;
    private int id;

    /*public Bmi(int height, int weight) {
        this.height = height;
        this.weight = weight;
        this.bmiVal = this.calculateBMI(height,weight);
        this.id = 1;
    }*/

    public Bmi() {
    }

    public double calculateBMI(int height,int weight){
        return ((double) weight) * 1e4 / (((double) height) * ((double) height));
    }

    public int makeId(){
        return 1;
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
