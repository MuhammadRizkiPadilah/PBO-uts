/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author dell
 */
import java.util.Scanner ;


public class Kelulusan2 {
    public static void main (String[] args) {
        String Jenis_Kelamin;
        int Tinggi;
        System.out.print("Kelamin (Laki-Laki/Perempuan) :");
        Scanner da = new Scanner(System.in);
   Jenis_Kelamin= da.nextLine();
      System.out.print("Tinggi Badan : ");
   Tinggi= da.nextInt();
   if ( "Laki-Laki".equals(Jenis_Kelamin)) {
        if(Tinggi <= 170){
       System.out.println("Anda Gagal");}
    else if((Tinggi >170) && (Tinggi <= 230)) 
       System.out.println("Selamat Anda Lulus");}
      if ("Perempuan".equals(Jenis_Kelamin)) {
        if(Tinggi <= 160){
       System.out.println("Anda Gagal");}
    else if((Tinggi >160) && (Tinggi <= 210)) 
       System.out.println("Selamat Anda Lulus");}
}
}
   
