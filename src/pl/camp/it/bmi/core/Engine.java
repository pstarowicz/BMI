package pl.camp.it.bmi.core;

import pl.camp.it.bmi.database.BmiDB;
import pl.camp.it.bmi.gui.GUI;

import java.util.Scanner;

public class Engine {
    public static void start(){
        boolean isWorking = true;
        Scanner scanner = new Scanner(System.in);
        BmiDB bmiDB = new BmiDB();

        while (isWorking) {
            GUI.showMenu();
            switch (scanner.nextLine()) {
                case "1":
                    GUI.addBmi(bmiDB);
                    GUI.showResult(bmiDB);
                    break;
                case "2":
                    GUI.remindResult(bmiDB);
                    break;
                case "3":
                    isWorking = false;
                    break;
                default:
                    System.out.println("Zły numer!");
                    break;
            }
        }
    }
}
