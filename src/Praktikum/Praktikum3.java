/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Praktikum3 {
    public static void main(String[]args){
        String nama,nis,tempat_lhr,tgl_lhr,jnsk,almt,motto;
        Scanner baca = new Scanner(System.in);
        
        System.out.println("Masukan Data Diri Anda :");
        System.out.print("Nama :");
        nama = baca.nextLine();
        
        System.out.print("NIS :");
        nis = baca.nextLine();
        
        System.out.print("Tampat Lahir :");
        tempat_lhr = baca.nextLine();
        
        System.out.print("Tanggal Lahir :");
        tgl_lhr = baca.nextLine();
        
        System.out.print("Jenis Kelamin :");
        jnsk = baca.nextLine();
        
        System.out.print("Alamat di Malang :");
        almt = baca.nextLine();
        
        System.out.print("Motto Hidup :");
        motto = baca.nextLine();
        
        System.out.println("==================");
        System.out.println(" BIODATA ");
        System.out.println("==================");
        System.out.println("Nama :");
        System.out.println("NIS :");
        System.out.println("Tempat Lahir  :");
        System.out.println("Tanggal Lahir :");
        System.out.println("jenis Kelamin :");
        System.out.println("Alamat Di Malang :");
        System.out.println("Motto Hidup :");
    }
}
