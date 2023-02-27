/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasdiagram;
import java.util.Scanner;

/**
 *
 * @author AURA
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ulang;
        do{
        System.out.println("\n=============================================");
        System.out.println("| PROGRAM MENGHITUNG LUAS KELINGLING BANGUN |");
        System.out.println("=============================================");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Oval/Elips");
        System.out.print("Masukkan pilihan (1..4)   : ");
        int pilihan = sc.nextInt();
        switch(pilihan){
            case 1 :
                square square_1=new square();
                System.out.print("\nMasukkan Panjang Sisi: ");
                square_1.side = sc.nextDouble();
                System.out.println("Luas Persegi     : " + square_1.calculated_area_of_square());
                System.out.println("Keliling Persegi : " + square_1.calculated_perimeter_of_square());
                break;
            case 2 :
                rectangle rectangle_1 = new rectangle();
                System.out.print("\nMasukkan Panjang : ");
                rectangle_1.lenght = sc.nextDouble();
                System.out.print("Masukkan Lebar   : ");
                rectangle_1.width = sc.nextDouble();
                System.out.println("Luas Persegi Panjang     : " + rectangle_1.calculated_area_of_rectangle());
                System.out.println("Keliling Persegi Panjang : " + rectangle_1.calculated_perimeter_of_rectangle());
                break;
            case 3 :
                Circle circle_1 = new Circle();
                System.out.print("\nMasukkan Jari-jari : ");
                circle_1.r = sc.nextDouble();
                System.out.println("Luas Lingkaran     : " + circle_1.calculated_area_of_circle());
                System.out.println("Keliling Lingkaran : " + circle_1.calculated_perimeter_of_circle());
                break;    
            case 4 :
                Oval oval_1 = new Oval();
                System.out.print("\nMasukkan Semi Major Axis : ");
                oval_1.semi_major = sc.nextDouble();
                System.out.print("Masukkan Semi Minor Axis : ");
                oval_1.semi_minor = sc.nextDouble();
                System.out.println("Luas Oval     : " + oval_1.calculated_area_of_oval());
                System.out.println("Keliling Oval : " + oval_1.calculated_perimeter_of_oval());
                break;
            default :
                System.out.println("PILIHAN YANG ANDA MASUKKAN TIDAK TERSEDIA");
                break;
                
        }
        System.out.print("\nIngin menghitung kembali? (y/t): ");
        ulang = sc.next().charAt(0);
    }while (ulang != 't');
     System.out.print("Terimakasih Telah Menggunakan Program ini!");
  }
}

