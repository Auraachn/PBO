/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author AURA
 */
public class Limas {
    double volume;
    public double sisi_1;
    public double sisi_2;
    public double tinggi;
    
    public Limas(){
        sisi_1=2;
        sisi_2=3;
        tinggi=10;
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
