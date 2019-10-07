/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan22.lingkaran;


import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055Latihan22Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======Perhitungan Lingkaran======");
       
           Scanner userInput = new Scanner (System.in);
            System.out.print("Masukkan nilai diameter lingkran:");
       String input = userInput.next();
   
       System.out.println("nilai diameter tidak sesuai");
        
      
     
       double phi= 3.14;
       double di = 0;
        System.out.print("Masukkan nilai diameter lingkran:"+di);
        di = userInput.nextDouble();
        
       
          
        
        System.out.println("=====hasil perhitungan lingkaran=====");
          double jari =( di/2);
        System.out.println("jari jari lingkaran:"+jari);
      
       
        int luas = (int) (phi*jari*jari);
        System.out.println("luas lingkaran"+luas);
        
        
        
        double keliling = 2*phi*jari;
        System.out.println("keliling lingkaran"+keliling);
    }  
    
}
