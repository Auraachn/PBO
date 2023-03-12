/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasbangun;
import java.util.Scanner;

public class TugasBangun {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Masukkan angka pertama    : "); a = sc.nextDouble();
        System.out.print("Masukkan angka kedua      : "); b = sc.nextDouble();
        System.out.print("Masukkan angka ketiga     : "); c = sc.nextDouble();
        
        kubus kubus1 = new kubus();
        kubus1.sisi=a;
        
        balok balok1 = new balok();
        balok1.lebar=a;
        balok1.panjang=b;
        balok1.tinggi=c;
        
        tabung tabung1 = new tabung();
        tabung1.jari_jari=a;
        tabung1.tinggi=b;
        
        limas limas1 = new limas();
        limas1.sisi_1=a;
        limas1.sisi_2=b;
        limas1.tinggi=c;
        
        bola bola1 = new bola();
        bola1.jari_jari=a;
        
        System.out.println("");
        System.out.println("KUBUS");
        System.out.println("================================");
        System.out.println("Sisi Kubus            = "+kubus1.sisi);
        System.out.println("Volume Kubus          = "+kubus1.GetVolume());
        System.out.println("================================");
        System.out.println("");
        System.out.println("BALOK");
        System.out.println("================================");
        System.out.println("Panjang Balok         = "+balok1.panjang);
        System.out.println("Lebar Balok           = "+balok1.lebar);
        System.out.println("Tinggi Balok          = "+balok1.tinggi);
        System.out.println("Volume Balok          = "+balok1.GetVolume());
        System.out.println("================================");
        System.out.println("");
        System.out.println("TABUNG");
        System.out.println("================================");
        System.out.println("Jari-jari Tabung      = "+tabung1.jari_jari);
        System.out.println("Tinggi Tabung         = "+tabung1.tinggi);
        System.out.println("Volume Tabung         = "+tabung1.GetVolume());
        System.out.println("================================");
        System.out.println("");
        System.out.println("LIMAS SEGI EMPAT");
        System.out.println("================================");
        System.out.println("Sisi 1 alas limas     = "+limas1.sisi_1);
        System.out.println("Sisi 2 alas Kubus     = "+limas1.sisi_2);
        System.out.println("tinggi Limas          = "+limas1.tinggi);
        System.out.println("Volume Limas          = "+limas1.GetVolume());
        System.out.println("================================");
        System.out.println("");
        System.out.println("BOLA");
        System.out.println("================================");
        System.out.println("Jari-jari Bola        = "+bola1.jari_jari);
        System.out.println("Volume Bola           = "+bola1.GetVolume());
        System.out.println("================================");
        
        
    }
    
}
