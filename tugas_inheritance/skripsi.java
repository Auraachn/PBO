/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_inheritance;

/**
 *
 * @author AURA
 */
public class skripsi extends buku{
    public String NPM;
    public skripsi(String NPM,String penulis, String judul, String penerbit, int tahun) {
        super(penulis, judul, penerbit, tahun);
        this.NPM = NPM;
    }
    
    @Override
    public String toString(){
        return "Judul buku  :" + this.judul + " \nPenulis    : " + this.penulis + " \nNPM    : " + this.NPM + " \nPenerbit  :" + this.penerbit + " \nTahun    : " + tahun   ;
    }
    
}
