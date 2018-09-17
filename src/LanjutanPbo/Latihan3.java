/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanjutanPbo;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Latihan3 {
public static void main(String[]args){
    Scanner baca = new Scanner(System.in);
    int a, b, c;
    System.out.println("program menjalanankan 2 nilai");
    System.out.print("Masukan nilai a :");
    a = baca.nextInt();
    System.out.print("Masukan nilai b :");
    b = baca.nextInt();
    System.out.print("Masukan nilai c :");
    c = baca.nextInt();
    System.out.println();
    System.out.println("jumlah a + b :"+(jumlah(a,b)));
    System.out.println("jumlah b + c :"+(jumlah(b,c)));
    System.out.println("jumlah a + c :"+(jumlah(a,c)));
}    
    private static int jumlah(int a, int c) {
       int hasil = a + c;
       return hasil;
    }
}
