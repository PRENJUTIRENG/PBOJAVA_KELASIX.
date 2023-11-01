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
public class absensi {
      public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta input nama siswa
        System.out.print("Masukkan Nama Siswa: ");
        String namaSiswa = input.nextLine();

        // Melakukan absensi berdasarkan nama siswa
        switch (namaSiswa) {
            case "Agustiar":
            case "Ezra":
            case "Asty":
            case "Avinda":
                System.out.println(namaSiswa + " hadir.");
                break;
            default:
                System.out.println(namaSiswa + " bolos.");
                break;
        }
        input.close();
      }
}
