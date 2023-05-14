/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading_and_overriding;

/**
 *
 * @author AURA
 */
public class main_course_spicy extends main_course{
    
    public main_course_spicy(String name, double price) {
        super(name, price);
    }
    
    @Override
    public void eat() {
        System.out.println("This main course is SPICY!\n");
    }
    
}
