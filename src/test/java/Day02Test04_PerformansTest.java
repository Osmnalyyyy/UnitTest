import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Day02Test04_PerformansTest {
    @Test
    void testPrintPerformans(){
        assertTimeout(Duration.ofSeconds(3),()-> IntStream.rangeClosed(1,100000).forEach(System.out::println));
    }
//2. örnek
    @Test
    void testPrintPerformans2(){
        assertTimeout(Duration.ofSeconds(5),()->IntStream.rangeClosed(1,5000000).reduce((x,y)->Math.addExact(x,y)));
    }
//bunu nerede kullanabiliriz :mesela task olarak verdiğiniz sorunu çözümü için yazılan kodun maksimum 2 sn içinde ekrana sonucu
}
