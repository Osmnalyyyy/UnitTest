import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day02Test01_DisplayName {
    @Test
    @DisplayName("Test parseInt() to check if it is throwing for non-digit value")// ekran çıktısına detaylı bilgi yazıyoruz
    void testException(){//test_parseInt_if_it_is_throwing_for_non_digit_value
        String str="merhaba";
        assertThrows(NumberFormatException.class,()->{
            Integer.parseInt(str);
        });

    }
}
