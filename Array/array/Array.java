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
    public static void main(String[] args) {
    Kubus a =new Kubus();
    Balok b =new Balok();
    Limas c =new Limas(); 
    Bola d =new Bola();
    Tabung e =new Tabung();
    
    double[] bangun_ruang = new double[5];
    double jumlah=0;
    for (int i = 0; i <bangun_ruang.length; i++){
        switch (i){
            case 0:
                bangun_ruang[0]= a.GetVolume();
                break;
            case 1:
                bangun_ruang[1]= b.GetVolume();
                break;
            case 2:
                bangun_ruang[2]= c.GetVolume();
            case 3:
                bangun_ruang[3]= d.GetVolume();
            case 4:
                bangun_ruang[4]= e.GetVolume();
            default:
                break;
        }
    }
    
    for(double sum:bangun_ruang){
        jumlah = +sum;
    }
    double rata_rata;
    rata_rata = jumlah/bangun_ruang.length;
        System.out.println("rata-rata seluruh bangun ruang adalah : " +rata_rata);
    }
    
}
