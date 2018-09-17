package Praktikum;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Praktikum1 {
    public static void main(String[]args){
        Scanner baca = new Scanner(System.in);
        int phi = 22/7;
        int r = 10;
        int hasil;
        hasil = 2*phi*r*r;
        System.out.println("Masukan nilai phi :"+phi);
        System.out.println("Masukan nilai r :"+r);
        System.out.println("========================");
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.println("========================");
        System.out.println("Luas Permukaan Bola :"+(2*phi*r*r));
        
    } 
}
