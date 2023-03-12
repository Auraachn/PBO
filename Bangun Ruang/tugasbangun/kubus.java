/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbangun;

/**
 *
 * @author AURA
 */
public class kubus {
    public double sisi;
    public double volume;
    
    public void setSsisi(double a){
        sisi = a;
    }
    
    public double getSisi(){
        return sisi;
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
