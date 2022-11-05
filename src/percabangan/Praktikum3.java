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
public class Praktikum3 {
    public static void main(String[] args){
        int nilai1, nilai2, nilai3;
        nilai1 = 9;
        nilai2 = 10;
        nilai3 = 8;
        
        System.out.println ("nilai1 = "+nilai1);
        System.out.println ("nilai2 = "+nilai2);
        System.out.println ("nilai3 = "+nilai3);
        System.out.print ("Kesimpulan : ");
        
        if ((nilai1 > nilai2)&&(nilai1 > nilai3 )){
            System.out.println("nilai 1 terbesar");}
        if ((nilai2 > nilai1) && (nilai2 > nilai3)) {
            System.out.println("Nilai 2 Terbesar") ;}
        if ((nilai3 > nilai1) && (nilai3 > nilai2)){
            System.out.println ("Nilai 3 Terbesar");}
        }
    }
