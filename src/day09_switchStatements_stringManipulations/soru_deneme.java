package day09_switchStatements_stringManipulations;

import java.util.Scanner;

public class soru_deneme {
    public static void main(String[] args) {
        System.out.println ( "2 basamaklı bir sayi giriniz: " );
        Scanner scanner = new Scanner ( System.in );
        int sayi = scanner.nextInt ();
        if (sayi >= 10 && sayi <= 99) {
            int birlerBasamagi = sayi % 10;
            int onlarBasamagi = sayi / 10;
            switch (onlarBasamagi) {
                case 1:
                    System.out.print ( "on" );
                    break;
                case 2:
                    System.out.print ( "yirmi" );
                    break;
                case 3:
                    System.out.print ( "otuz" );
                    break;
                case 4:
                    System.out.print ( "kirk" );
                    break;
                case 5:
                    System.out.print ( "elli" );
                    break;
                case 6:
                    System.out.print ( "altmis" );
                    break;
                case 7:
                    System.out.print ( "yetmis" );
                    break;
                case 8:
                    System.out.print ( "seksen" );
                    break;
                case 9:
                    System.out.print ( "doksan" );
                    break;
            }
            switch (birlerBasamagi) {
                case 1:
                    System.out.println ( "bir" );
                    break;
                case 2:
                    System.out.println ( "iki" );
                    break;
                case 3:
                    System.out.println ( "uc" );
                    break;
                case 4:
                    System.out.println ( "dort" );
                    break;
                case 5:
                    System.out.println ( "bes" );
                    break;
                case 6:
                    System.out.println ( "alti" );
                    break;
                case 7:
                    System.out.println ( "yedi" );
                    break;
                case 8:
                    System.out.println ( "sekiz" );
                    break;
                case 9:
                    System.out.println ( "dokuz" );
                    break;
            }
        }
    }
}

