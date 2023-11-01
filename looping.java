/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dasarjava;

/**
 *
 * @author Deni hafidz
 */
public class looping {
    public static void main(String[] args){
      for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i);
  
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); 
  }
} 

    }
}
