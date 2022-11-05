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

public class BobotNilaiHuruf {
    public static void main(String[] args) {
        String huruf;
        Scanner h1 = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Masukkan Huruf Yang Mau di Konversi = ");
        huruf = h1.nextLine();
    
    switch (huruf){
        case "a"  :
            System.out.println(  huruf + "adalah 4");
            break;
        case "b" :
            System.out.println(  huruf + "adalah 3");
            break;
        case "c" :
             System.out.println(  huruf + "adalah 2");
             break;
        case "d" :
            System.out.println(  huruf + "adalah 1");
            break;
        case "e" :
            System.out.println(  huruf + "adalah 0");
            break;
        }
    }
}
