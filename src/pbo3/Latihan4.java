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

public class Latihan4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Apakah anda mahasiswa ITS Mandiri, Rizki?(Y jika setuju)");
        String jawaban=scan.next();
        if("Y".equals(jawaban)){
            System.out.println("Selamat berjuang di ITS Mandiri Rizki ?");
        }else{
            System.out.println("Selamat datang di ITS Mandiri Rizki ?");
        }
    } 
}
