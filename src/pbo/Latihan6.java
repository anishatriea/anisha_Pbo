/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Latihan6 {
    public static void main(String[]args){
    Scanner baca = new Scanner(System.in);
    System.out.print("Masukan nilai WEB :");
    int nilai = baca.nextInt();
     if(nilai >= 90)
    System.out.println("Niali A");
     else if(nilai >=75)
     System.out.println("Niali B");
     else if(nilai >=50)
         System.out.println("Nilai C");
     else if(nilai >=35)
         System.out.println("Nilai D");
     else
         System.out.println("Nilai E");
     
    }
}
