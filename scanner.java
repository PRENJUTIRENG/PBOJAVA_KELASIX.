/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasarjava;

/**
 *
 * @author Deni hafidz
 */
import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        String name;
        int kelas;
        double usia;
        float absen;
        
        Scanner papanketik = new Scanner(System.in);
         
        System.out.print("MASUKAN NAMA: ");
        name = papanketik.nextLine();
        System.out.print("MASUKAN KELAS: ");
        kelas = papanketik.nextInt();
        System.out.print("MASUKAN USIA: ");
        usia = papanketik.nextDouble();
        System.out.print("MASUKAN ABSEN: ");
        absen = papanketik.nextFloat();
        
        System.out.println("=========================");
        System.out.println("Informasi siswa");
        System.out.println("=========================");
        System.out.println("NAMA : "+name);
        System.out.println("KELAS : "+kelas);
        System.out.println("USIA : "+usia);
        System.out.println("ABSEN : "+absen);

        


        
        
    }
}
