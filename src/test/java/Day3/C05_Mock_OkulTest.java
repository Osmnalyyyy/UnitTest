package Day3;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class C05_Mock_OkulTest {
    //bağımlı olan classı mockluyoruz(okul class'ı işlemler class'ına  bağımlı )
    //    //içinde başka classdan obje oluşan class o class'a bağlıdır.
    @Test
    void operasyonlarTest() {
        C05_Mock_Islemler dummyObject = Mockito.mock(C05_Mock_Islemler.class);
        dummyObject.guncelleOgrenci("Ahmet");
        dummyObject.silOgrenci("Mehmet");
        dummyObject.ekleOgrenci("Kasım");
        // methodlar çağrılmış mı kontrol edelim
        verify(dummyObject).ekleOgrenci("Kasım");
        verify(dummyObject).silOgrenci("Mehmet");
        verify(dummyObject).guncelleOgrenci("Ahmet");
    }

    // method kaç kere çağrıldığını test edelim
    @Test
    void testKacKereCagirildi() {
        C05_Mock_Islemler dummyObject2 = Mockito.mock(C05_Mock_Islemler.class);
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.guncelleOgrenci("Mehmet");
        //dummyObject2.silOgrenci("Ahmet");
        // Acaba Ahmet parametresi ile ekleOgrenci() metodu 2 defa çağrıldı mı
        verify(dummyObject2, times(2)).ekleOgrenci("Ahmet");
        // ekleOgrenci() metodunu "Buse" parametresi ile çağırılığ çağrılmadığını test ediyorum
        verify(dummyObject2, times(0)).ekleOgrenci("Buse");
        //herhangi bir parametre ile hiç çağrılmayan metodu test etmek istersek
        verify(dummyObject2, never()).silOgrenci(anyString());
        // metodumuzun en az 2 defa çağrıldığını test etmek istersek
        verify(dummyObject2, atLeast(2)).ekleOgrenci("Ahmet");
        // metodumuzun en fazla 2 defa çağrıldığını test etmek istersek
        verify(dummyObject2, atMost(2)).ekleOgrenci("Ahmet");
    }

    // methodların çağrılma sırasını test etmek istersem :
    @Test
    void testSiralama() {
       C05_Mock_Islemler dummyObject3=Mockito.mock(C05_Mock_Islemler.class);
       dummyObject3.ekleOgrenci("Ahmet");
       dummyObject3.ekleOgrenci("Mehmet");
       dummyObject3.silOgrenci("Ahmet");
       // Inorder class'ı sıralama için kullanılır
        InOrder inOrder=inOrder(dummyObject3);
        inOrder.verify(dummyObject3).ekleOgrenci("Ahmet");
        inOrder.verify(dummyObject3).ekleOgrenci("Mehmet");
        inOrder.verify(dummyObject3).silOgrenci("Ahmet");
    }

}

// kalan kısım için : https://www.youtube.com/watch?v=Qd7upjtEN6E&list=PLZYKO7600KN89x_tdqGhP7n8b0KXPC8EY&index=8






