/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbangun;

/**
 *
 * @author AURA
 */
public class limas {
    double volume;
    public double sisi_1;
    public double sisi_2;
    public double tinggi;
    
    public void setSisi_1 (double a){
        sisi_1 = a;
    }
    
    public double getSisi_1(){
        return sisi_1;
    }
    
    public void setSisi_2 (double b){
        sisi_2 = b;
    }
    
    public double getSisi_2(){
        return sisi_2;
    }
    
    public void setTinggi (double c){
        tinggi = c;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public void ComputeAndSetVolume(){
        double hitung;
        hitung = sisi_1 * sisi_2 * tinggi;
        this.volume = hitung;
    }
    
    public double GetVolume(){
        ComputeAndSetVolume();
        return this.volume;
    }
}
