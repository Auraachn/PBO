/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_inheritance;

/**
 *
 * @author AURA
 */
public class koleksi {
    public String judul;
    public String penerbit;
    public int tahun;
    
    public koleksi(String judul, String penerbit, int tahun){
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    
    @Override
    public String toString(){
        return "Judul buku  : " + this.judul + " \nPenerbit  : " + this.penerbit + " \nTahun    : " + this.tahun  ;
    }
}
