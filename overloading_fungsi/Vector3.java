/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading_fungsi;

/**
 *
 * @author AURA
 */
public class Vector3 {
    
    public int[] operate( int[]items, int a ) {
        int i = 0;
        for (i=0; i<3; i++){
            items[i]=items[i] * a;
        }
        return items;
    }
    
    public int operate( int[]item, int[]item2){
        int i = 0;
        int b;
        int jumlah = 0;
        for (i=0; i<3; i++){
            b = item[i]*item2[i];
            jumlah += b;
        }
        return jumlah;
    }
}
