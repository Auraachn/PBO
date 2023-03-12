/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbangun;

/**
 *
 * @author AURA
 */
public class tabung {
    double volume;
    public double jari_jari;
    public double tinggi;
    public double phi=3.14;
    
    public void setJari_jari (double a){
        jari_jari = a;
    }
    
    public double getJari_jari(){
        return jari_jari;
    }
    
    public void setTinggi (double b){
        tinggi = b;
    }
    
    public double getTinggi(){
        return tinggi;
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
