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
public class Latihan8 {
    public static void main(String[]args){
        Scanner baca = new Scanner(System.in);
         System.out.print("Masukan nilai TPA :");
         int TPA = baca.nextInt();
          System.out.print("Masukan Nailai Bhs Inggris :");
          int bhsinggris = baca.nextInt();
          if((TPA >85)&&(bhsinggris <80))
         System.out.println("Siswa Dapat Beasiswa");
          else 
               System.out.print("Siswa Tidak dapat Beasiswa");
    }
}
