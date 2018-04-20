package ru.otr.td;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneDirectory {
    public HashMap<String, ArrayList<String>> phoneDirectory = new HashMap<String, ArrayList<String>>();


    public ArrayList<String> findPhonesByName(String name) {
        return phoneDirectory.get(name);
    }

    public void addNote(String name, ArrayList<String> numbersList) {
        phoneDirectory.put(name, numbersList);
    }

    public HashMap<String, ArrayList<String>> getPhoneDirectory() {
        return phoneDirectory;
    }

    public void setPhoneDirectory(HashMap<String, ArrayList<String>> phoneDirectory) {
        this.phoneDirectory = phoneDirectory;
    }
}
