/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;
/**
 *
 * @author AURA
 */
public class Array {

    Kubus a =new Kubus();
    Balok b =new Balok();
    Limas c =new Limas(); 
    Bola d =new Bola();
    Tabung e =new Tabung();
    public static void main(String[] args) {
    double[] bangun_ruang = new double[5];
    double jumlah=0;
    for (int i = 0; i <bangun_ruang.length; i++){
        switch (i){
            case 0:
                bangun_ruang[1]= a.GetVolume();
            case 1:
                bangun_ruang[2]= b.GetVolume();
            case 2:
                bangun_ruang[2]= c.GetVolume();
            case 3:
                bangun_ruang[2]= d.GetVolume();
            case 4:
                bangun_ruang[2]= e.GetVolume();
            default:
                break;
        }
        jumlah = +bangun_ruang[i];
    }
    double rata_rata;
    rata_rata = jumlah/bangun_ruang.length;
        System.out.println(rata_rata);
    }
    
}
