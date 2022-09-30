package Day3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.mockito.Mockito;

public class C06_ErrorTest {

    @Test
    void test(TestInfo info){
        // ErrorRunner classında divide methodu 5 ve 0 parametreleri ile
        // hata fırlatırken aynı methodu mock'lanan obje üzerinden
        // çağırdığımızda hata fırlatmaz obje sahte olduğu için method gerçekten çalışmaz
        //Mockito.mock(C06_Error.class); yerine new C06_Error(); deseydik exception fırlatırdı
        C06_Error error= Mockito.mock(C06_Error.class);
        error.divide(5,0);// test geçer çünkü dönen değer önemli değil method geliyormu diye baktı sadece
                                // mock'ladığımız methodun fırlattığı exception önemli değil
        System.out.println(info.getDisplayName()+" çalıştı");
    }
}
