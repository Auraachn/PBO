/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_1;

/**
 *
 * @author AURA
 */
public class UTS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bus bus = new Bus();
        
        bus.tambahHalte(1,"ASAL", 5, 0);
        bus.tambahdetail(1, "PORONG", 3);
        bus.tambahdetail(1, "GRESIK", 2);
        bus.tambahHalte(2,"PORONG", 2, 3);
        bus.tambahdetail(2,"GRESIK", 1);
        bus.tambahdetail(2,"GRESIK", 1);
        bus.tambahHalte(3,"SURABAYA", 5, 1);
        bus.tambahdetail(3,"SURABAYA", 5);
        bus.tambahHalte(4,"Gresik", 0, 5);
        
        bus.jalankan();
        System.out.println("------------------------------------------------");
    }}
    
