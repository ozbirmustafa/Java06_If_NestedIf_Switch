package day06nestedifswitch;


public class NestedIf01 {
    public static void main(String[] args) {

        /*
        password un ilk harfi büyük harf ise
        'A' olursa geçerli password, aksi halde geçersiz password
            password un ilk harfi küçük harf ise
        'z' olursa geçerli password, aksi halde geçersiz password
        */




//        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {
//
//            if (pwd.charAt(0) == 'A') {
//                System.out.println("Geçerli Password");
//            } else {
//                System.out.println("Geçersiz Password");
//            }
//
//        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') {
//            if (pwd.charAt(0) == 'z') {
//                System.out.println("Geçerli Password");
//            } else {
//                System.out.println("Geçersiz Password");
//            }
//
//        }else {
//            System.out.println("ilk karakter harf olmalıdır");
//
//        }

        //Java nested kodları çalıştırırken çok zaman harcar. "Time Complexity"
        //Bu yüzden mümkünse "nested" kod yazmamaya çalışırız.


        String pwd = "Acsdf";
        char ilkHarf =pwd.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {

            if (ilkHarf == 'A') {
                System.out.println("Geçerli Password");
            } else {
                System.out.println("Geçersiz Password");
            }

        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {
            if (ilkHarf == 'z') {
                System.out.println("Geçerli Password");
            } else {
                System.out.println("Geçersiz Password");
            }

        }else {
            System.out.println("ilk karakter harf olmalıdır");

        }
    }
}
