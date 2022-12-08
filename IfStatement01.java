package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {


        //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz");

        short age = scan.nextShort();

        if (age<0){
            System.out.println("Geçerli yaş giriniz");
        } else if (age<5) {
            System.out.println("baby");
        } else if (age<13) {
            System.out.println("child");

        } else if (age<21) {
            System.out.println("teenager");

        } else if (age<31) {
            System.out.println("adult");
        }else {
            System.out.println("not expected age");
        }

        //BVA= boundary value analyze test


    }
}
