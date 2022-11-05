/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author dell
 */
import java.util.Scanner;


public class Soal3 {
    public static void main(String[] args) {
        String nama,nim,semester,kelas;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Nama     :");
        nama = inputan.nextLine();
        System.out.print("Masukkan NIM      :");
        nim = inputan.nextLine();
        System.out.print("Masukkan Semester :");
        semester = inputan.nextLine();
        System.out.print("Masukkan Kelas    :");
        kelas = inputan.nextLine();
        System.out.println("------Hasil------");
        System.out.println("Nama        :"+nama);
        System.out.println("NIM         :"+nim);
        System.out.println("Semester    :"+semester);
        System.out.println("Kelas       :"+kelas);
        
    }
    
}
