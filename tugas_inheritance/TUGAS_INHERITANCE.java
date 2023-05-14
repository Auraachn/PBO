/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_inheritance;

/**
 *
 * @author AURA
 */
public class TUGAS_INHERITANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        koleksi a = new koleksi("Si Kancil", "Gramedia", 2009);
        System.out.println(a.toString());
        
        System.out.println("\n\n");
        
        buku b = new buku("J. K. Rowling", "Harry Potter, The Philosopher's Stone", "Gramedia", 1997);
        System.out.println(b.toString());

        System.out.println("\n\n");
        
        majalah c = new majalah("Keempat", "Poedjangga Baru", "Gramedia", 2011);
        System.out.println(c.toString());
        
        System.out.println("\n\n");
        
        skripsi d = new skripsi("21081000001","Indiarti", "Analisis Kepuasan Layanan Perpustakaan Daerah A", "Universitas ABC", 2019);
        System.out.println(d.toString());
    }
    
}
