import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Day01Repeat {
    @Test
    void testLength() {
        String str = "ne olacak bu isler";
        int anlikDeger = str.length();
        int beklenenDeger = 18;
        assertEquals(beklenenDeger, anlikDeger, "different length");
    }

    @Test
    void testKarekokAlma() {
        int num1 = 4;
        double anlikDeger = Math.sqrt(num1);
        double beklenenDeger = 2;
        assertEquals(beklenenDeger, anlikDeger, "wrong output");
    }

    @Test
    void testAyniHarfMi() {
        String str = "osman";

        char anlikDeger = str.charAt(0);
        char beklenenDeger = 'o';
        assertEquals(beklenenDeger, anlikDeger, "wrong character");
    }

    @Test
    void testEndsWith() {
        String str = "osman";
        boolean anlikDeger = str.endsWith("n");
        boolean beklenenDeger = true;
        assertEquals(beklenenDeger, anlikDeger);

    }

    @Test
    void testFindMax() {
        assertTrue(Math.max(5, 6) == 6);
        String str = "osman";
        assertFalse(str.contains("d"));
    }

    @Test
    void testArrays() {
        String[] str = "osman".split("");
        assertTrue(str.length == 5, "wrong output");

    }

    @Test
    void testList() {
        List<Integer> list = new ArrayList<>();
        assertFalse(list.contains("e"));
    }

    int x;

    @BeforeEach
    void beforeEach() {
        x = 15;
        System.out.println("beforeEach() calisti");
    }

    @AfterEach
    void afterEach() {
        x = 16;
        System.out.println("afterEach() calisti");
    }

    @Test
    void testContains(TestInfo info) {
        List<Integer> list = new ArrayList<>();
        assertFalse(list.contains(x));
        System.out.println(info.getDisplayName() + " works");
    }

    @Test
    void testMax(TestInfo info) {
        assertFalse(Math.max(56, x) == x);
        System.out.println(info.getDisplayName() + " works");
    }

    @BeforeAll
    static void beforeAll(TestInfo info) {
        System.out.println(info.getDisplayName() + " started");
    }

    @AfterAll
    static void afterAll(TestInfo info) {

        System.out.println(info.getDisplayName() + " finished");
    }

    @Test
    void testWithArrays(TestInfo info) {
        String sentence = "What a world";
        String[] anlikDeger = sentence.split(" ");
        String[] beklenenDeger = {"What", "a", "world"};
        assertArrayEquals(beklenenDeger, anlikDeger, "not equal");
    }

    @Test
    void testWithList(TestInfo info) {
        Integer[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> intList = new ArrayList<>();
        for (Integer w:intArr
             ) {
            intList.add(w);
        }

      int anlikDeger=intList.get(1);
      int beklenenDeger=2;
      assertEquals(beklenenDeger,anlikDeger,"not equal");

    }
}
