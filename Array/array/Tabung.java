/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author AURA
 */
public class Tabung {
  double volume;
    public double jari_jari;
    public double tinggi;
    public double phi=3.14;
    
    public Tabung(){
        jari_jari=70;
        tinggi=10;
    }
    
    public void ComputeAndSetVolume(){
        double hitung;
        hitung = phi * jari_jari * jari_jari * tinggi;
        this.volume = hitung;
    }
    
    public double GetVolume(){
        ComputeAndSetVolume();
        return this.volume;
    }     
}
