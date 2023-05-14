/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading_and_overriding;

/**
 *
 * @author AURA
 */
public class main_course extends food {
    public main_course(String name, double price) {
        super(name, price);
    }
     @Override
    public void eat() {
        System.out.println("This main course is amazing!\n");
    }
    }
