package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        /*
        Kullanıcıya ay ismi sorular ve kullanıcının verdiği ay isminden son aya kadar ekrana yazdırınız.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ay ismini giriniz");
        String ayISmi = scan.next().toLowerCase();

        //toLowerCase() methodu bir Stringteki tüm karakterleri küçük harfe çevirir.
        //toUpperCase() methodu bir Stringteki tüm karakterleri büyük harfe çevirir.

        //break olmazsa alt satırı da yazdırır.

        switch (ayISmi){

            case "ocak":
                System.out.println("Ocak");
            case "şubat":
                System.out.println("Şubat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayıs":
                System.out.println("Mayıs");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "ağustos":
                System.out.println("Ağustos");
            case "eylül":
                System.out.println("Eylül");
            case "ekim":
                System.out.println("Ekim");
            case "kasım":
                System.out.println("Kasım");
            case "aralık":
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Geçerli Ay İsmi Giriniz");


        }



    }
}
