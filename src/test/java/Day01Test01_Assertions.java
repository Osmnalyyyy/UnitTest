import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day01Test01_Assertions {

    @Test
    public void test() {
        //main methodu yokken nasıl calıstı ?
        // Junit icinde gömülü gelen main method çağırılıyor
        //class boş oldugu icin test geçti

    }

    @Test
    public void testLength() {
        String cumle = "Merhaba dunyam";// 14 karakter
        int anlikDeger = cumle.length();
        int beklenenDeger = 14;
        //  assertEquals(beklenenDeger, anlikDeger);
        // testim hata verdiğinde mesaj vermek istiyorsam
        assertEquals(beklenenDeger, anlikDeger, "uzunluklar uyuşmadı");
    }

    @Test
    public void testUpperCase() {
        String anlikDeger = "Merhaba".toUpperCase();
        String beklenenDeger = "MERHABA";
        assertEquals(beklenenDeger, anlikDeger, "UpperCase methodu düzgün çalışmıyor");
    }

    @Test
    public void testToplama() {
        int sayi1=10;
        int sayi2=5;
        int anlikDeger=Math.addExact(sayi1,sayi2);
        int beklenenDeger=15;
        assertEquals(beklenenDeger,anlikDeger);
    }

    @Test
    public void testContains(){
        assertEquals(false,"osman".contains("z"));
    }


}
