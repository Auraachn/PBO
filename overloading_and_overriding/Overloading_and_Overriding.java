/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading_and_overriding;

/**
 *
 * @author AURA
 */
public class Overloading_and_Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        food burger = new food("burger", 25000);
        burger.print(); 
        burger.eat();
        System.out.println("The Price is Rp."+burger.getTotalPrice(3, 10)+"\n");
        
        
        appetizers apt = new appetizers("Oyster Ponzu", 30000);
        apt.eat();
        System.out.println("The Price is Rp."+apt.getTotalPrice(1, 4)+"\n");
        
        main_course ckn = new main_course("Butter Chicken",42000);
        ckn.eat();
        System.out.println("The Price is Rp."+ckn.getTotalPrice(2)+"\n");
        
        main_course_spicy ckns = new main_course_spicy("Spicy Grilled Checken",35000);
        ckns.eat();
        
        dessert dst = new dessert("Cheesecake",21000);
        dst.eat();
        System.out.println(dst.temperature(15));
        System.out.println(dst.temperature("cold"));
        ;
        
        
    }
    
}
