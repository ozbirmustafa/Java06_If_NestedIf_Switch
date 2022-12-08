package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan işlem ve iki tane sayı alarak işlemin sonucunu ekrana yazdıran
        basit bir hesap makinesi yapınız
         */

        //Switch'te sadece int, byte, char, short, String data tipleri kullanilabilir.
        //*NOTE* Üçten fazla durum varsa switch() tercih. ex:haftanın günleri vs

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen İşlem Seçiniz: +,-,*,/,%");
        char islem = scan.next().charAt(0);

        System.out.println("İlk Sayıyı Giriniz");
        double ilk = scan.nextDouble();
        System.out.println("İkinci Sayıyı Giriniz");
        double ikinci = scan.nextDouble();

        switch (islem){

            case '+':
                System.out.println(ilk + ikinci);
                break;
            case '-':
                System.out.println(ilk - ikinci);
                break;
            case '*':
                System.out.println(ilk * ikinci);
                break;
            case '/':
                System.out.println(ilk / ikinci);
                break;
            case '%':
                System.out.println((ilk*ikinci)/100);
                break;
            default:
                System.out.println("Bu işlem tanımlanamamıştır");

        }








    }
}
