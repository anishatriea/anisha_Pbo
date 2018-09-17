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
public class Latihan4 {
    public static void main(String[]args){
        Scanner baca = new Scanner(System.in);
        int bil, hasil;
        System.out.print("Masukan satu bilangan :");
        bil = baca.nextInt();
        hasil = factorial(bil);
        System.out.println("Nilai Factorial"+bil+"adalah"+hasil);
    }

    private static int factorial(int a) {
      if (a==1);
         return 1;
         else
         return(a*factorial(a-1));

}
}
