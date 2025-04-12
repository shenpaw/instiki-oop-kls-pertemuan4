/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydimensi;

import java.util.Scanner;

/**
 *
 * @author Shendy Aulia Mursyd
 */
public class ArrayDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nama = new String[5];
        
        nama[0]= "Yinari";
        nama[1]= "Santika";
        nama[2]= "Arduino";
        nama[3]= "Turendra";
        nama[4]= "Sastra";
        
        Scanner inp = new Scanner (System.in);
        
        for(int idx=0; idx<5; idx++){
            System.out.print("Data teman ke-"+String.valueOf(idx)+": "); // Integer.toString()
            nama[idx] = inp.nextLine();
        }
        
        String NamaTeman = nama[2];
        System.out.printf("Data Teman : %s", nama[2]);
        
        for(int idx=0; idx<5; idx++){
            System.out.println("Data teman ke-"+String.valueOf(idx)+": "+ nama[idx]);
        }
        
        //kalau di php ini model foreach
        //khusus di array
        for(String nm: nama){
            System.out.println(nm);
        }
       
        //tampilkan data array dengan perulangan
    }
    // lebih baik gunakan while daripada do
}
