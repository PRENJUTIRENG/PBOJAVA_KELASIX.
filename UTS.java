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
public class UTS {
    public static void main(String[] args){
        Scanner board = new Scanner(System.in);
        String nama, kelas, absen; /**type data untuk nama, kelas dan absen*/
        int tugas, hasil, uts, uas; /**type data untuk tugas, hasil, uts, uas*/
        
        System.out.print("NAMA :"); /**Input nama*/
        nama = board.nextLine();
        System.out.print("KELAS :");/**Input kelas*/
        kelas = board.nextLine();
        System.out.print("ABSEN :"); /**Input absen*/
        absen = board.nextLine();
         System.out.print("NILAI TUGAS :"); /**Input tugas*/
        tugas = board.nextInt();
         System.out.print("NILAI UTS :"); /**Input nilai uts*/
        uts = board.nextInt();
         System.out.print("NILAI UAS:"); /**Input nilai uas*/
        uas = board.nextInt();
        
        hasil = (tugas * 10/100)+(uts * 30/100)+(uas * 60/100);  /**rumus hasil*/
        System.out.println("NILAI AKHIR : "+hasil);
        
        if(hasil >= 85 && hasil <= 100){  /**jika lebih besar dari 85 nilai A*/
            System.out.println("GRADE A");
        }
        if(hasil >= 75 && hasil <= 85){ /**jika kurang dari 85 nilai B*/
            System.out.println("GRADE B");
        }
        if(hasil >= 65 && hasil <= 75){ /**jika kurang dari 74 nilai C*/
             System.out.println("GRADE C");
        }
          if(hasil >= 50 && hasil <= 65){ /**jika kurang dari 65 nilai D*/
             System.out.println("GRADE D");
        }
          else{
              System.out.println("GRADE E");
          }
    }
}
