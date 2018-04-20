package ru.otr.td.app;

import ru.otr.td.PhoneDirectory;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        String name1 = "Иванов И.И.";
        String name2 = "Петров П.П.";
        String name3 = "Сидоров С.С.";

        ArrayList<String> numbersList1 = new ArrayList<String>();
        numbersList1.add("+8 800 2000 500");
        numbersList1.add("+8 800 200 600");
        ArrayList<String> numbersList2 = new ArrayList<String>();
        numbersList2.add("+8 800 2000 700");
        ArrayList<String> numbersList3 = new ArrayList<String>();
        numbersList3.add("+8 800 2000 800");
        numbersList3.add("+8 800 2000 900");
        numbersList3.add("+8 800 2000 000");

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.addNote(name1, numbersList1);
        phoneDirectory.addNote(name2, numbersList2);
        phoneDirectory.addNote(name3, numbersList3);

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        ArrayList<String> numpersList = phoneDirectory.findPhonesByName(name);
        try {
            for (String number : numpersList) {
                System.out.println(number);
            }
        } catch (NullPointerException e) {
            System.out.print("Name is missing in the database");
        }
    }
}
