/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author AURA
 */
public class Kubus {
    public double sisi;
    public double volume;
    
    public Kubus(){
        sisi=6;
    }
    
    public void ComputeAndSetVolume(){
        double hitung;
        hitung = sisi * sisi * sisi;
        this.volume = hitung;
    }
    
    public double GetVolume(){
        ComputeAndSetVolume();
        return this.volume;
    }
}
