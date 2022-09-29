package Day3;

public class C01_StringModify {

    // task:kelimenin ilk iki harfinde A varsa silinsin
    // kelime içindeki harflerin tamamı büyük olacak
    //AABC--->,ABC->BC

    public String deleteAIfITIsInFirstIntoPosition(String str) {
        if (str.length() <= 2) {
            return str.replace("A", "");
        }
        String firstTwoChars=str.substring(0,2);
        String afterFirstTwoChars=str.substring(2);
        return firstTwoChars.replaceAll("A","")+afterFirstTwoChars;
    }
}
