package day10_StringManipluations;

import java.util.Scanner;

public class C06_IndexOf {
    public static void main(String[] args) {

    String str = "Ali topu at, at Ali at";


    // indexOf() metodu parametre olarak hem string hem de char kabul eder

        System.out.println ( str.indexOf ( "t" )); // 4
        System.out.println (str.indexOf ( 't' )); // 4


        System.out.println ( str.indexOf ( "Ali" ) ); // 0

        System.out.println ( str.indexOf ( "pu at" ) ); // 6
        System.out.println ( str.indexOf (' ') );


        System.out.println ( str.indexOf ( "t", 7 ) );
        // 7 . index ve sonrasindaki ilk t nin index'ini verir
        //" u at, at Ali at"


        // kullanicidan bir metin isteyip
        // girilen metindeki 2. a nin index' ini yazdirin


        Scanner scanner = new Scanner ( System.in );
        System.out.println ("Lutfen bir metin giriniz");
        String metin = scanner.nextLine ();

        // JAva ile ders su gubub akiyor... :)

         int ilkindex = metin.indexOf ( "a" );
        System.out.println (metin.indexOf ( "a",ilkindex+1 ));





    }
}
