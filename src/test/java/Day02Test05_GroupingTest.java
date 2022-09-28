import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test05_GroupingTest {
    // amacımız birbirleriyle ilişkili testleri gruplamak,aynı sınıfın içinde
    //2 parametreli test yazarak gruplamak istiyoruz:

    @Nested
    //Math class'ının multiplyExact() methodunu sıfırlı veya sıfırsız parametreler ile
            // test etmek için yazdığım 2 test methodunu @Nested annotation ile grupluyoruz
    class  MultiplyTest{
        @ParameterizedTest
        @CsvSource(value = {"-12,-4,3","-12,4,-3","12,-4,-3"})//x=y+z  yaptık
        void testMultiplyWithNonZero(int x,int y, int z){
            assertEquals(x,Math.multiplyExact(y,z));
        }
        @ParameterizedTest
        @CsvSource(value = {"0,-4,0","0,4,0","0,0,4"})//x=y+z  yaptık
        void testMultiplyWithZero(int x,int y, int z){
            assertEquals(x,Math.multiplyExact(y,z));
        }
    }

    //1. grup testin sonu
    @Nested
            //Math class'ının multiplyExact() methodunu sıfırlı veya sıfırsız parametreler ile
            // test etmek için yazdığım 2 test methodunu @Nested annotation ile grupluyoruz
    class AddTest{
        @ParameterizedTest
        @CsvSource(value = {"-1,-4,3", "1,4,-3", "-7,-4,-3"})//x=y*z  yaptık
        void testAddWithNonZero(int x,int y,int z){
            assertEquals(x,Math.addExact(y,z));
        }

        @ParameterizedTest
        @CsvSource(value ={ "9,0,9", "2,2,0", "4,4,0"})//x=y*z  yaptık
        void testAddWithZero(int x,int y,int z){
            assertEquals(x,Math.addExact(y,z));
        }
    }
    //2. grup testin sonu
}
