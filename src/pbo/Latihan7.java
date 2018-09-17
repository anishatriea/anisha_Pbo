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
public class Latihan7 {
    public static void main(String[]args){
        Scanner baca = new Scanner(System.in);
        System.out.print("Silahkan pilih angka 1-3 :");
        int bil = baca.nextInt();
        switch (bil){
            case 1 :  System.out.println("Satu");
            break;
            case 2 : System.out.println("Dua");
            break;
            case 3 :  System.out.println("Tiga");
            break;
       }
                
    }
}
