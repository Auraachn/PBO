/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading_and_overriding;

/**
 *
 * @author AURA
 */
public class appetizers extends food{
    
    public appetizers(String name, double price) {
        super(name, price);
    }
     @Override
    public void eat() {
        System.out.println("This appetizer is amazing!\n");
    }
    
    @Override
    public double getTotalPrice(double quantity, double discount) {
        double total;
        double total_end;
        double extra_dis;
        total = (price * quantity);
        discount = total - ((discount/100) *total);
        extra_dis = 0.2*discount;
        total_end = discount - extra_dis;
        return total_end;
    }
}
