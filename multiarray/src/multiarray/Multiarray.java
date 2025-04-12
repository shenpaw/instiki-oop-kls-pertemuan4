/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiarray;

import java.util.Scanner;

/**
 *
 * @author Shendy aulia mursyd
 */
public class Multiarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] meja = new String[3][4]; //String[3][4] menentukan jumlah max baris dan kolom
        
        Scanner inp = new Scanner(System.in);
        
        for(int brs=0; brs<2; brs++){ //brs<2 membuatnya menjadi 2 baris
            for(int klm=0; klm<4; klm++){ //klm<3 membuatnya menjadi 3 kolom perbarisnya
                System.out.println("Data Meja Baris: %d, kolom: %d:"+meja[brs][klm]);
            }
            System.out.println("");//memisahkan perbaris
        
    }
        // TODO code application logic here
    }
    
}
