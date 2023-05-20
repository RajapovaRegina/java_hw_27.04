import java.util.*;


public class HomeWork {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        System.out.println ("Erste Wort:");
        String erste = S.nextLine();
        System.out.println ("Zweite Wort:");
        String zweite = S.nextLine();
        System.out.println ("EUR in USD:");
        double EUR = Double.parseDouble(S.nextLine());
        System.out.println(returnNewWord(erste));
        System.out.println(returnNewWord1(zweite));
        System.out.println("Mathe Aufgaben:");
        System.out.println(returnNewWord2());
        System.out.println(returnNewWord3());
        System.out.println(returnNewWord4());
        System.out.println(returnNewWord5());
        System.out.println("EUR in USD:");
        System.out.println(returnNewWord6(EUR));


    }
    public static String returnNewWord(String str) {
        int half = str.length() / 2;
        String result1 = str.substring(0, half);
        return result1;
    }
    public static String returnNewWord1(String str1) {
        int midle = str1.length() / 2;
        String result2 = str1.substring(midle, str1.length());
        return result2;
    }

    public static int returnNewWord2() {
        int x = 5;
        int y = 2;
        int Summe = x + y;
        return Summe;
    }
    public static int returnNewWord3() {
        int x = 22;
        int y = 18;
        int Subtraktion = x - y;
        return Subtraktion;
    }
    public static int returnNewWord4() {
        int x = 64;
        int y = 8;
        int Division = x / y;
        return Division;
    }
    public static int returnNewWord5() {
        int x = 9;
        int y = 9;
        int multiplikation = x * y;
        return multiplikation;
    }
    public static double returnNewWord6(double EUR) {
        double USD = EUR * 1.08;
        return USD;


    }




}
