/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator_1;

/**
 *
 * @author AURA
 */
public class Operan {
    double a;
    double b;
    double c;
    
    double tambah(){
        c = a+b;
        return c;
    }
    double kurang(){
        c = a-b;
        return c;
    }
    double multiple(){
        c = a*b;
        return c;
    }
    double divide(){
        c = a/b;
        return c;
    }
    
    double modulus(){
        c = a%b;
        return c;
    }
}
