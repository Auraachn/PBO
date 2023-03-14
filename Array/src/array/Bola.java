/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author AURA
 */
public class Bola {
    double volume;
    public double jari_jari;
    public double phi=3.14;
    
    public Bola(){
        jari_jari=50;
    }
    
    public void ComputeAndSetVolume(){
        double hitung;
        hitung = (4/3) * jari_jari * jari_jari * phi ;
        this.volume = hitung;
    }
    
    public double GetVolume(){
        ComputeAndSetVolume();
        return this.volume;
    }  
}
