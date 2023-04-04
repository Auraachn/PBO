/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AURA
 */
public class Bus {
   int maxPenumpang = 20;
    int penumpangSekarang = 0;
    List<Halte> daftarHalte = new ArrayList<>();
    List<turun> detail = new ArrayList<>();

    void tambahHalte(int urutan, String nama, int naik, int turun) {
        Halte halte = new Halte(urutan, nama, naik, turun);
        daftarHalte.add(halte);
    }
    
    void tambahdetail(int urutan, String nama, int turun){
        turun down = new turun (urutan, nama, turun);
        detail.add(down);
    }

    void jalankan() {
        for (Halte halte : daftarHalte) {
            System.out.println("------------------------------------------------");
            System.out.println("  ||           == Halte " + halte.nama+" ==         ||");
            System.out.println("------------------------------------------------");
            
            switch (halte.urutan){
                case 1 :
                    System.out.println("->  Halte "+halte.nama+" : 0 penumpang menunggu");
                    break;
                case 2 :
                    System.out.println("Halte "+halte.nama+" : "+halte.naik+" penumpang menunggu");
                    break;
                case 3 :
                    System.out.println("Halte "+halte.nama+" : "+halte.naik+" penumpang menunggu");
                    break;
                case 4 :
                    System.out.println("Halte "+halte.nama+" : "+halte.naik+" penumpang menunggu");
                    break;
            }
            
            int naik = Math.min(halte.naik, maxPenumpang - penumpangSekarang);
            int turun = Math.min(halte.turun, penumpangSekarang);

            penumpangSekarang += naik - turun;

            System.out.println(" => "+naik + " penumpang telah naik");
          
            switch (halte.urutan){
                case 1 :
                    for(turun down :detail){
                        if(down.urutan==1){
                            System.out.println("    - "+down.turun+" penumpang akan turun di Halte "+down.nama);
                        }
                    }
                    break;
                case 2 :
                    for(turun down :detail){
                        if(down.urutan==2){
                            System.out.println("    - "+down.turun+" penumpang akan turun di Halte "+down.nama);
                        }
                    }
                    break;
                case 3 :
                    for(turun down :detail){
                        if(down.urutan==3){
                            System.out.println("    - "+down.turun+" penumpang akan turun di Halte "+down.nama);
                        }
                    }
                    break;
                case 4 :
                    for(turun down :detail){
                        if(down.urutan==4){
                            System.out.println("    - "+down.turun+" penumpang akan turun di Halte "+down.nama);
                        }
                    }
                    break;
            }

            if (penumpangSekarang >= maxPenumpang) {
                int menunggu = halte.naik - naik;

                if (menunggu > 0) {
                    System.out.println("Terdapat " + menunggu + " penumpang yang menunggu di halte ini.");
                }

                break;
            }
            System.out.println(" => "+turun + " penumpang telah turun");
            System.out.println("Jumlah penumpang di dalam bus: " + penumpangSekarang);
            switch (halte.urutan){
                case 1 :
                    System.out.println("->  Halte "+halte.nama+" : 0 penumpang menunggu");
                    break;
                case 2 :
                    int a = halte.naik;
                    int b = halte.naik;
                    System.out.println("Halte "+halte.nama+" : "+(a - b)+" penumpang menunggu");
                    break;
                case 3 :
                     a = halte.naik;
                     b = halte.naik;
                    System.out.println("Halte "+halte.nama+" : "+(a - b)+" penumpang menunggu");
                    break;
                case 4 :
                     a = halte.naik;
                     b = halte.naik;
                    System.out.println("Halte "+halte.nama+" : "+(a - b)+" penumpang menunggu");
                    break;
            }

            System.out.println();
        }
    }}
    
    
            
   
    