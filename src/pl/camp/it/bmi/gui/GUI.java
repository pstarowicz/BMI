package pl.camp.it.bmi.gui;

import pl.camp.it.bmi.model.Bmi;
import pl.camp.it.bmi.database.BmiDB;

import java.util.Scanner;

public class GUI {

    public static void showMenu() {
        System.out.println();
        System.out.println("1. Oblicz BMI.");
        System.out.println("2. Przypomnij BMI.");
        System.out.println("3. Exit.");
    }

    public static void addBmi(BmiDB bmiDB) {
        Scanner scanner = new Scanner(System.in);
        Bmi bmi = new Bmi();
        System.out.println("Podaj wzrost (cm):");
        bmi.setHeight(Integer.parseInt(scanner.nextLine()));
        System.out.println("Podaj wagę (kg):");
        bmi.setWeight(Integer.parseInt(scanner.nextLine()));
        bmi.setBmiVal(bmi.calculateBMI(bmi.getHeight(), bmi.getWeight()));
        bmi.setId(bmiDB.getBmis().length + 1);
        bmiDB.addBmi(bmi);
    }

    public static void showResult(BmiDB bmiDB) {
        Bmi bmi = bmiDB.getBmis()[bmiDB.getBmis().length - 1];
        bmiResults(bmi.getBmiVal());
        System.out.println("ID badania: " + bmi.getId());
    }

    private static void bmiResults(double bmiVal) {
        System.out.print("BMI wynosi " + bmiVal + ", co oznacza ");
        if (bmiVal < 16) {
            System.out.println("wygłodzenie.");
        } else if (16 <= bmiVal && bmiVal < 17) {
            System.out.println("wychudzenie.");
        } else if (17 <= bmiVal && bmiVal < 18.5) {
            System.out.println("niedowagę.");
        } else if (18.5 <= bmiVal && bmiVal < 25) {
            System.out.println("wartość prawidłową.");
        } else if (25 <= bmiVal && bmiVal < 30) {
            System.out.println("nadwagę.");
        } else if (30 <= bmiVal && bmiVal < 35) {
            System.out.println("I stopień otyłości.");
        } else if (35 <= bmiVal && bmiVal < 40) {
            System.out.println("II stopień otyłości.");
        } else {
            System.out.println("skrajną otyłość.");
        }
    }

    public static void remindResult(BmiDB bmiDB) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID:");
        int id = Integer.parseInt(scanner.nextLine());
        if (bmiDB.checkID(id)) {
            Bmi bmi = bmiDB.searchBmi(id);
            System.out.println("Dane dla ID=" + id + ":");
            System.out.println("Wzrost: " + bmi.getHeight());
            System.out.println("Waga: " + bmi.getWeight());
            bmiResults(bmi.getBmiVal());
        } else {
            System.out.println("Nie znaleziono ID");
        }
    }
}
