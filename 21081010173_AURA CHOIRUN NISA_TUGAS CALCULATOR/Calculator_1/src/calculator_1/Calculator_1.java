/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator_1;
import java.util.Scanner;

public class Calculator_1 {
    public static void main(String[] args) {
        Input hitung1 = new Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan data yang akan dihitung (Beri spasi tiap operan dan angka  : ");
        String userInput = sc.nextLine();
        
        hitung1.ProsesInput(userInput);
    }} 
