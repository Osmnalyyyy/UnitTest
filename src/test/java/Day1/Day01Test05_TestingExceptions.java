package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day01Test05_TestingExceptions {
    // test ettiğimiz methodun beklediğimiz exception fırlattı mı
    @Test
    void testException() {
        String str = "Merhaba dunya";
        assertThrows(NullPointerException.class, () -> {
            System.out.println("Text exception is run");
            str.length();
        });


    }

    //bolme islemi için exception kontrolu
    @Test
    void testException2() {
        int sayi1 = 1;
        int sayi2 = 0;
        //beklenen Exceptionun parenti olan RunTimeException da yazılabilir
        assertThrows(ArithmeticException.class, () -> {
            System.out.println(sayi1 / sayi2);
        });
    }

    // yukarıdaki soruyu method ekleyerek yapalım
    @Test
    void testException3() {
        int num1 = 1;
        int num2 = 0;
        assertThrows(ArithmeticException.class,()->{
            divide(num1,num2);
        });
    }

    private int divide(int x, int y) {
        return x / y;
    }

}
