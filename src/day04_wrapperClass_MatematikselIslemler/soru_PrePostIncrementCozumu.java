package day04_wrapperClass_MatematikselIslemler;

public class soru_PrePostIncrementCozumu {
    public static void main(String[] args) {

        int a = 10;
        System.out.println ( "a' nin degeri : " + ++a );

        int b = a++;

        System.out.println ("b'nin degeri : " + b );

        int c = b++ + a;

        System.out.println ( "c' nin degeri : " + c );

        System.out.println ("Son toplam : " + (a+b+c));







    }
}
