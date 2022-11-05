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

public class Latihan5 {
    public static void main(String[] args){
        int a=(int)(Math.random()*10),b=(int)(Math.random()*10),hasil=a+b;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Berapakah hasil dari "+a+" dan "+b+"?");
        int jawaban =scan.nextInt();
        if (jawaban==hasil){
            System.out.println("Selamat, Jawaban Anda benar");
        }else{
            System.out.println("Maaf, Jawaban yang benar adalah "+hasil);
        }
    }
    
}
