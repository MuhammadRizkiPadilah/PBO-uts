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
import java.util.Scanner;

public class Diskon {
    public static void main(String[] args){
        
    Scanner dis = new Scanner(System.in);
        
        int harga ;
        int jumlah;
        int diskon;
        int total;
        
        
        System.out.println("Harga barang : ");
        harga = dis.nextInt();
        System.out.println("Jumlah barang : ");
        jumlah = dis.nextInt();
        total = harga*jumlah;
        
        if (total>=1000000){
        diskon=total*30/100;
        total=total-diskon;
            System.out.println("Selamat anda mendapatkan diskon 30 %");
            System.out.println("Jadi totalnya : "+total);
        }
        else if (total >= 500000){
        diskon=total*20/100;
        total=total-diskon;
            System.out.println("Selamat anda mendapatkan diskon 20%");
            System.out.println("Jadi totalnya :"+total);
        }
        else if (total >= 100000){
        diskon=total*10/100;
        total=total-diskon;
            System.out.println("Selamat and mendapatkan diskon 10%");
            System.out.println("Jadi totalnya :"+total);
        }
        else if (total<100000){
        diskon=total*0/100;
        total=total-diskon;
            System.out.println("Anda nggak dapat diskon");
            System.out.println("jadi totalnya : "+total);
        
        }
    }
}
