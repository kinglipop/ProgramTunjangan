/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan17.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program tunjangan
 */
public class PBO11K10118904Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double gaji,tunjangan,totalgaji = 0;
        
        System.out.println("=========== Program Tunjangan ===========");
        System.out.print("Berapa gaji pokok anda perbulan : Rp.");
        
        gaji = input.nextDouble();
        
        System.out.print("Status anda ? (Menikah/Belum)   : ");
        String status = input.next();
        
        if (status.equals("Menikah"))
            tunjangan = 0.35 * gaji;
        else 
            tunjangan = 0;
        
        totalgaji = gaji + tunjangan;
        
        System.out.println("");
        System.out.println("====== Hasil Perhitungan Gaji Anda ======");
        System.out.println("Gaji pokok \t\t : Rp." + gaji);
        System.out.println("Tunjangan \t\t : Rp." + tunjangan);
        System.out.println("Tota; gaji \t\t : Rp." + totalgaji);
        System.out.println("(Developed by : Firman Alfinas)");
    }
    
}
