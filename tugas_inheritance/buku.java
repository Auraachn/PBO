/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_inheritance;

/**
 *
 * @author AURA
 */
public class buku extends koleksi {
    public String penulis;
    public buku(String penulis, String judul, String penerbit, int tahun) {
        super(judul, penerbit, tahun);
         this.penulis = penulis;
    }
    
    @Override
    public String toString(){
        return "Judul buku  :" + this.judul + " \nPenulis    : " + this.penulis + " \nPenerbit  :" + this.penerbit + " \nTahun    : " + this.tahun   ;
    }
    
}
