package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {


        // Verilen String bir listediki,
        // kullanilan toplam harf / karakter sayisini bulunuz


        List <String>isimler = new ArrayList<> ( Arrays.asList ( "Seren" , "Eghbal", "Ilgar","Joanna","Ali Cabbar" ));

        int toplamKarakterSayisi = 0;

        for (int i = 0; i < isimler.size (); i++) {
            isimler.get ( i );

            toplamKarakterSayisi += isimler.get(i).length ();


        }
        System.out.println ("Listede toplam " + toplamKarakterSayisi + " adet harf veya karakter kullanilmistir");





    }
}
