import org.junit.Before;
import org.junit.Test;
import ru.otr.td.PhoneDirectory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PhoneDirectoryTest {
    private PhoneDirectory phoneDirectory;
    private ArrayList<String> listPhones;

    @Before
    public void init() {
        phoneDirectory = new PhoneDirectory();
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

        listPhones = new ArrayList<String>();
        listPhones.add("+8 800 2000 500");
        listPhones.add("+8 800 200 600");
    }

    @Test
    public void shouldBeMatchingPhones() {
        assertTrue(listPhones.equals(phoneDirectory.findPhonesByName("Иванов И.И.")));
    }

    @Test
    public void shouldBeNotMatchingPhones() {
        assertFalse(listPhones.equals(phoneDirectory.findPhonesByName("Петров П.П.")));
    }

    @Test
    public void shouldReturnNull() {
        assertTrue(null == phoneDirectory.findPhonesByName("Алексеев А.А."));
    }

    @Test
    public void shouldAddEntry() {
        phoneDirectory.addEntry("Ермаков Е.Е.", listPhones);
        assertTrue(phoneDirectory.phoneStorage().size() == 4);
    }
}
