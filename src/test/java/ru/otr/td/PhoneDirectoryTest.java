package ru.otr.td;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PhoneDirectoryTest {
    private PhoneDirectory phoneDirectory;
    private List<String> listPhones;

    @Before
    public void init() {
        phoneDirectory = new PhoneDirectory();
        String name1 = "Иванов И.И.";
        String name2 = "Петров П.П.";
        String name3 = "Сидоров С.С.";

        List<String> numbersList1 = new ArrayList<>();
        numbersList1.add("+8 800 2000 500");
        numbersList1.add("+8 800 200 600");
        List<String> numbersList2 = new ArrayList<>();
        numbersList2.add("+8 800 2000 700");
        List<String> numbersList3 = new ArrayList<>();
        numbersList3.add("+8 800 2000 800");
        numbersList3.add("+8 800 2000 900");
        numbersList3.add("+8 800 2000 000");

        phoneDirectory.addEntry(name1, numbersList1);
        phoneDirectory.addEntry(name2, numbersList2);
        phoneDirectory.addEntry(name3, numbersList3);

        listPhones = new ArrayList<>();
        listPhones.add("+8 800 2000 500");
        listPhones.add("+8 800 200 600");
    }

    @Test
    public void shouldBeMatchingPhones() {
        assertEquals(listPhones,phoneDirectory.findPhonesByName("Иванов И.И."));
    }

    @Test
    public void shouldBeNotMatchingPhones() {
        assertFalse(listPhones.equals(phoneDirectory.findPhonesByName("Петров П.П.")));
    }

    @Test
    public void shouldReturnNull() {
        assertNull(phoneDirectory.findPhonesByName("Алексеев А.А."));
    }

    @Test
    public void shouldAddEntry() {
        phoneDirectory.addEntry("Ермаков Е.Е.", listPhones);
        assertEquals(phoneDirectory.phoneStorage().size(), 4);
    }
}
