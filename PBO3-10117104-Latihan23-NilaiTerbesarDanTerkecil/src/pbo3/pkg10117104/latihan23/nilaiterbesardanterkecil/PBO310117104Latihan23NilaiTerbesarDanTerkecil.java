/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * NIM  :10117104
 * Deskripsi : Memasukkan Nilai dan Menampilkan Nilai Terbesar dan Terkecil
 * 
 */
public class PBO310117104Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nama;
    int banyak;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    Scanner scn = new Scanner(System.in);
    
    System.out.println("========Program Nilai Terbesar dan Terkecil==========");
    System.out.printf("Masukkan Nama Petugas : ");
    nama=scn.next();
    System.out.printf("Masukan Banyaknya Nilai Mahasiswa : ");
    banyak=scn.nextInt();
    
    int[] nilai = new int[banyak];
    for(int i=0 ; i<banyak ; i++){
    System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" : ");
    nilai[i]=scn.nextInt();
    if(nilai[i]>max){
        max=nilai[i];
    }
    if(nilai[i]<min){
        min = nilai[i];
    }
        
    }
   
    System.out.println("");
    
    System.out.println("==========Hasil Nilai Mahasiswa=============");
        for(int i=0 ; i<banyak ; i++){
    System.out.println("Nilai Mahasiswa ke-"+(i+1)+" : "+nilai[i]);        
        
        }
        System.out.println("");
        
        System.out.println("Nilai Terbesar = "+max);    
        System.out.println("Nilai Terkecil = "+min);
        System.out.println("");
        System.out.println("Nama Petugas   = "+nama);
    }
    
}
