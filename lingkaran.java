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
public class lingkaran {
    public static void main(String[] args){
        int luas;
        Scanner jrjr = new Scanner(System.in);
        System.out.println("Rumus luas adalah luas = 22/7 x jari-jari x jari-jari");
        System.out.print("Jari-jari : ");
        int jj = jrjr.nextInt();
        luas = 22/7 * jj * 2;
        System.out.println("Hasil : "+luas);
    }
}
