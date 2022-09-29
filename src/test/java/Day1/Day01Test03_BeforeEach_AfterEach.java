package Day1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day01Test03_BeforeEach_AfterEach {
    String str;

    @BeforeEach// teste girmeden bu degeri alıyor
    void beforeEach() {
        str = "Junit5 is better then Junit4";
        System.out.println("beforeEach() calisti");
    }

    @AfterEach// testten cıkınca bu degeri alıyor
    void afterEach() {
        str = null;
        System.out.println("afterEach() calisti");
    }

    @Test
    void testArrays(TestInfo info) {// hangi testin çalıştıgını anlamak için parametre girildi
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"Junit5", "is", "better", "then", "Junit4"};
        System.out.println(info.getDisplayName()+" calisti");
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }

    @Test
    void testStringLength(TestInfo info){
        int anlikDeger=str.length();
        int beklenenDeger=28;
        assertEquals(beklenenDeger,anlikDeger);
        System.out.println(info.getDisplayName()+" calisti");

    }
}
