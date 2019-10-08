/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan23.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menghitung nilai terbesar terkecil
 * 
 */
public class PBO11K10118907Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int byk;
        System.out.print("Masukkan nama petugas : ");
        Scanner scanner = new Scanner(System.in);
        String nama = scanner.next();
        
        System.out.print("Masukkan banyaknya nilai mahasiswa : ");
        Scanner scanner2 = new Scanner(System.in);
        String nilai = scanner2.next();
        byk = Integer.parseInt(nilai);
        hitung(byk, nama);
    }
    
    public static void hitung(int byk, String nama) {
        int high = 0, low = 0, max = 0, min = 0;
        Integer[] nilai2 = new Integer[byk];
            
        for(int i = 0;i<byk; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            Scanner scanner = new Scanner(System.in);
            String nilai3 = scanner.next();
            
            nilai2[i] = Integer.parseInt(nilai3);
            
            /**
             * Taken and inspired from
             * https://stackoverflow.com/questions/1806816/java-finding-the-highest-value-in-an-array
             * Question from HelloWorld - https://stackoverflow.com/users/188122/helloworld
             * Solution from Sahil Chhabra - https://stackoverflow.com/users/1462282/sahil-chhabra
             */
            max = Math.max(nilai2[i], max);
            min = Math.min(nilai2[i], min);
        }
        System.out.println();
        for(int i = 0;i<byk; i++) {
            System.out.println("Nilai mahasiswa ke-"+(i+1)+" = "+nilai2[i]);
        }
        
        System.out.println("\nNilai terbesar adalah "+max);
        System.out.println("Nilai terkecil adalah "+min);
        System.out.println("\nPetugas : "+nama);
    }
}
