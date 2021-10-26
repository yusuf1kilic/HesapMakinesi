package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.println("birinci sayıyı giriniz");
        a=input.nextInt();
        System.out.println("ikinci sayı giriniz");
        b=input.nextInt();
        System.out.println("lütfen toplama için 1, çıkarma için 2, çarpma için 3, bölme için 4'e basınız");
        c=input.nextInt();
        switch (c){
            case 1:
                System.out.println("toplamınızın sonucu ="+(a+b));
                break;
            case 2:
                System.out.println("çıkarmanızın sonucu ="+(a-b));
                break;
            case 3:
                System.out.println("çarpmanızın sonucu"+(a*b));
                break;
            case 4:
                System.out.println("bölmenizin sonucu ="+(a/b));
                break;
            default:
                System.out.println("hatalı giriş");
        }



    }
}
