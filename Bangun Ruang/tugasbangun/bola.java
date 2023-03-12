/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbangun;

/**
 *
 * @author AURA
 */
public class bola {
    double volume;
    public double jari_jari;
    public double phi=3.14;
    
    public void setJari_jari (double a){
        jari_jari = a;
    }
    
    public double getJari_jari(){
        return jari_jari;
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
