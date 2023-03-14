/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author AURA
 */
public class Balok {
    public double panjang;
    public double lebar;
    public double tinggi;
    public double volume;
    
    public Balok(){
        panjang=5;
        lebar=3;
        tinggi=10;
    }
    
    public void ComputeAndSetVolume(){
        double hitung;
        hitung = panjang * lebar * tinggi;
        this.volume = hitung;
    }
    
    public double GetVolume(){
        ComputeAndSetVolume();
        return this.volume;
    }
}
