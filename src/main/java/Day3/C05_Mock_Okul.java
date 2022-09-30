package Day3;

public class C05_Mock_Okul {
// okul class'ı işlemler class'ına bağlı bir class
    C05_Mock_Islemler islemler=new C05_Mock_Islemler();

    public void operasyonlar(){
        islemler.ekleOgrenci("Ali");
        islemler.ekleOgrenci("Ali");
        islemler.guncelleOgrenci("Ahmet");
        islemler.silOgrenci("Ali");
    }
}
