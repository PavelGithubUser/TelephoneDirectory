package ru.otr.td;

import java.util.List;
import java.util.HashMap;

public class PhoneDirectory {
    public HashMap<String, List<String>> PhoneStorage = new HashMap<>();


    public List<String> findPhonesByName(String name) {
        return PhoneStorage.get(name);
    }

    public void addEntry(String name, List<String> numbersList) {
        PhoneStorage.put(name, numbersList);
    }

    public HashMap<String, List<String>> phoneStorage() {
        return PhoneStorage;
    }

    public void setPhoneStorage(HashMap<String, List<String>> phoneStorage) {
        this.PhoneStorage = phoneStorage;
    }
}
