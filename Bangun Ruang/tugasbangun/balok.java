/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbangun;

/**
 *
 * @author AURA
 */
public class balok {
    public double panjang;
    public double lebar;
    public double tinggi;
    public double volume;
    
    public void setTinggi (double a ){
        panjang = a;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public void setlebar (double b){
        lebar = b;
    }
    
    public double getlebar(){
        return lebar;
    }
    
    public void setPanjang (double c){
        panjang = c;
    }
    
    public double getPanjang(){
        return panjang;
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
