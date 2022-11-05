/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3;

/**
 *
 * @author dell
 */
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int sisi;
        System.out.println("Pilih metode");
        System.out.println("1. Menghitung luas persegi");
        System.out.println("2. Menghitung keliling persegi");
        System.out.println("Pilihan");
        int pilihan = inp.nextInt();
        switch (pilihan){
            case 1:
                System.out.print("Masukan luas persegi : ");
                sisi = inp.nextInt();
                int luas = sisi*sisi;
                System.out.println("Luas persegi adalah "+luas+" cm");
                break ;
            case 2 :
                System.out.print("Masukan panjang sisi persegi : ");
                sisi = inp.nextInt();
                int keliling = 4*sisi;
                System.out.println("Keliling persegi adalah "+keliling+" cm");
                break ;
            default:
                System.out.println("Sistem Error");
        }
    }
    
}
