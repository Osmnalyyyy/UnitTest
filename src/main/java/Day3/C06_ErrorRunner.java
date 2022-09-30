package Day3;

public class C06_ErrorRunner {
    public static void main(String[] args) {
        // divide methodu 5,0 parametreleri ile çağrılınca exception fırlatır
        C06_Error object=new C06_Error();
        object.divide(5,0);
    }
}
