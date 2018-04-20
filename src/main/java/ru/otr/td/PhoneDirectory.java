package ru.otr.td;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneDirectory {
    public HashMap<String, ArrayList<String>> phoneDirectory = new HashMap<>();


    public ArrayList<String> findPhonesByName(String name) {
        return phoneDirectory.get(name);
    }

    public void addEntry(String name, ArrayList<String> numbersList) {
        phoneDirectory.put(name, numbersList);
    }

    public HashMap<String, ArrayList<String>> phoneStorage() {
        return phoneDirectory;
    }

    public void setPhoneDirectory(HashMap<String, ArrayList<String>> phoneDirectory) {
        this.phoneDirectory = phoneDirectory;
    }
}
