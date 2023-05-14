/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading_fungsi;
import java.util.Arrays;
/**
 *
 * @author AURA
 */
public class Overloading_Fungsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]d={1,2,3};
        int[]b={4,5,6};
        Vector3 baru = new Vector3();
        System.out.println(baru.operate(d, b));
        System.out.println(Arrays.toString(baru.operate(d, 5))+"\n");
    }
    
}
