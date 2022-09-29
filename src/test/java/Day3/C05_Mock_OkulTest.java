package Day3;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class C05_Mock_OkulTest {
    //bağımlı olan classı mockluyoruz(okul class'ı işlemler class'ına  bağımlı )
    //    //içinde başka classdan obje oluşan class o class'a bağlıdır.
    @Test
    void islemler() {
        C05_Mock_Islemler dummyObject = Mockito.mock(C05_Mock_Islemler.class);//C05_Mock_Islemler class'ından mock'la fake obje oluşturduk(fake obje)
        dummyObject.guncelleOgrenci("Ahmet");// parametreler fake
        dummyObject.silOgrenci("Ali");
        dummyObject.ekleOgrenci("Omer");
        //methodlar çağrılmış mı kontrol edelim
        verify(dummyObject).ekleOgrenci("Omer");// yukarıdaki degerlerle aynı olmak zorunda
        verify(dummyObject).silOgrenci("Ali");
        verify(dummyObject).guncelleOgrenci("Ahmet");
    }

    // method kaç defa çağırıldığını test edelim
    @Test
    void testKacKereCagirildi(){
        C05_Mock_Islemler dummyObject2 = Mockito.mock(C05_Mock_Islemler.class);
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Mehmet");
        //acaba Ahmet parametresi ile ekleOgrenci() metodu ile 2 defa cagrıldı mı
        verify(dummyObject2,times(2)).ekleOgrenci("Ahmet");
        // ekleOgrenci() methodunu Buse parametresi ile çağrılıp çağrılmadığını test ediyoruz
        verify(dummyObject2,times(0)).ekleOgrenci("Buse");

    }



}
