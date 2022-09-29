package Day2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test03_RepeatTestMultipleTimes {
    //testi tekrarlatmak istesem
    @RepeatedTest(5)
    void testSubstring(){
        assertEquals("Java","Java is an OOP language".substring(0,4));
        System.out.println("test çalıştı");
    }
    //2. örnek
  //  @Disabled// bu annotasyon testi çalıştırmaz
    @RepeatedTest(3)
    void testRepeated(){
        assertEquals(2,Math.addExact(1,1));
        System.out.println("ok");
    }
    // 3. örnek
    Random rnd=new Random();
    @RepeatedTest(5)
    void testMathExact(){
        int sayi1=rnd.nextInt(10);
        int sayi2=rnd.nextInt(10);
        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2));
        System.out.println("sayi1 = "+sayi1+ " sayi2= "+sayi2);
    }

























}
