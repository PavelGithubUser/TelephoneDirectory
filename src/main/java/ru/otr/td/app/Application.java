package ru.otr.td.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.otr.td.PhoneDirectory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    static PhoneDirectory phoneDirectory = new PhoneDirectory();
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        logger.info("Set name");

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        List<String> matchingPhones;
        if ((matchingPhones = initPhoneStorage().findPhonesByName(name)) != null) {
            for (String number : matchingPhones) {
                System.out.println(number);
            }
        } else {
            logger.info("Name is missing in the database");
        }

    }

    static PhoneDirectory initPhoneStorage() {
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

        phoneDirectory.addEntry(name1, numbersList1);
        phoneDirectory.addEntry(name2, numbersList2);
        phoneDirectory.addEntry(name3, numbersList3);
        return phoneDirectory;
    }

}
