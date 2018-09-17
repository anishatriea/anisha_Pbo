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
public class Latihan2 {
    public static void main(String[]args){
        Scanner baca = new Scanner(System.in);
        int pilihan = 9;
        do{
            System.out.println("\n MENU LUAS BANGUN \n");
            System.out.println("1. Menghitung Luas Persegi");
            System.out.println("2. Menghitung Luas Persegi panjang");
            System.out.println("3. keluar");
            System.out.print("Masukan Pilihan :");
            pilihan = baca.nextInt();
            switch(pilihan){
                case 1 : luaspersegi();break;
                case 2 : luaspersegipanjang();break;
            }
        }while (pilihan !=3);
    }
    private static void luaspersegi() {
        Scanner baca = new Scanner(System.in);
        float sisi,luas;
        System.out.println("Masukan Nilai Sisi :");
        sisi = baca.nextFloat();
        luas = sisi*sisi;
        System.out.println("Luas Persegi adalah :"+luas);             
    }
    private static void luaspersegipanjang() {
         Scanner baca = new Scanner(System.in);
        float panjang,lebar,luas;
        System.out.println("Masukan Nilai panjang :");
        panjang = baca.nextFloat();
        System.out.println("Masukan Nilai lebar :");
        lebar = baca.nextFloat();
        luas = panjang * lebar;
        System.out.println("Luas Persegi panjang adalah :"+luas);     
        }
}

