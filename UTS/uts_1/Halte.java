/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_1;

/**
 *
 * @author AURA
 */
public class Halte {
     String nama;
    int naik, turun;
    int urutan;
    
    Halte(int urutan, String nama, int naik, int turun) {
        this.urutan = urutan;
        this.nama = nama;
        this.naik = naik;
        this.turun = turun;
    }
}