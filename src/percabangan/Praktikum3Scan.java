/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author dell
 */
import java.util.Scanner;

public class Praktikum3Scan {
    public static void main(String[] args){
        int nilai1, nilai2, nilai3;
        Scanner inputan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Masukan 3 angka");
        System.out.print("Masukan nilai 1 : ");
        nilai1 = inputan.nextInt();
        System.out.print("Masukan nilai 2 : ");
        nilai2 = inputan.nextInt();
        System.out.print("Masukan nilai 3 : ");
        nilai3 = inputan.nextInt();
        
        System.out.println ("Kesimpulan : ");
        
        if ((nilai2 < nilai1)&&(nilai3 > nilai1 )){
            System.out.println("nilai 1 adalah terbesar");}
        if ((nilai1 > nilai2) && (nilai3 > nilai2)) {
            System.out.println("Nilai 2 adalah Terbesar") ;}
        if ((nilai3 > nilai2) && (nilai3 > nilai1)){
            System.out.println ("Nilai 3 adalah Terbesar");}
        else 
            System.out.println("Semua nilai adalah sama");
        }
    }
        
      