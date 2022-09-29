package Day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day02Test02_ParameterizedTest {
    @Test
    void testLength() {
        assertTrue("Osman".length() > 0);
        assertTrue("Emre".length() > 0);
        assertTrue("Gorkem".length() > 0);
        assertTrue("Omer".length() > 0);
    }

    // yukarıdaki methodu daha kolay yazmak için parametreli testler kullanırız
    @ParameterizedTest
    @ValueSource(strings = {"Osman", "Emre", "Gorkem", "Omer"})
// girecegimiz parametreleri buraya yazıyoruz
    void testLength2(String str) {
        assertTrue(str.length() > 0);

    }

    //2. örnek
    @Test
    void testUpperCase() {
        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";
        assertEquals("MERHABA", str1.toUpperCase());
        assertEquals("JAVA", str2.toUpperCase());
        assertEquals("TEST", str3.toUpperCase());
    }

    // yukarıdaki örneği parametreleri olarak test edelim
    @ParameterizedTest
    @CsvSource(value = {
            "MERHABA,merhaba",
            "JAVA, java",
            "TEST,test"

    })
    void testUpperCase(String str1, String str2) {
        assertEquals(str1, str2.toUpperCase());
    }


    @ParameterizedTest
    @CsvSource(value = {"true,java,a", "true,junit,u", "false,hello,a"})
    void testContains(boolean b1,String str1,String str2) {
        assertEquals(b1,str1.contains(str2));
    }



}