/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_inheritance;

/**
 *
 * @author AURA
 */
public class majalah extends koleksi{
    public String edisi;
    public majalah(String edisi, String judul, String penerbit, int tahun) {
        super(judul, penerbit, tahun);
        this.edisi = edisi;
    }
    
    @Override
    public String toString(){
        return "Judul buku  :" + this.judul + " \nedisi    : " + this.edisi + " \nPenerbit  :" + this.penerbit + " \nTahun    : " + this.tahun   ;
    }
    
}
