package day11_stringManipulations;

public class C01LastIndexOf {
    public static void main(String[] args) {


        String str = "java cok zevkli";


        // metnin kac karakter oldugunu yazdirin

        System.out.println (str.length ()); // 15

        // son karakteri yazdirin


        System.out.println (str.charAt ( str.length ()-1 )); // i

        // stre' da z harfi kullanilmis mi ?

        System.out.println ( str.contains ( "z" ) ); // true

        // str'da ilk k'nin index'ini yazdirin

        System.out.println (str.indexOf ( 'k' )); // 7


        // str 'da cok kelimesinin index'nini yazdirin

        System.out.println ( str.indexOf ( "cok" ) ); // 5


        // str' da k'nin son kullaniminin index'ini yazdirin


        System.out.println ( str.lastIndexOf ( "k" ) ); // 12


        // str'da "k" nin son kullanimindan bir onceki kullaniminin index'ini yazdirin

        System.out.println ( str.lastIndexOf ( "k", 12-1 ) );


    }
}
