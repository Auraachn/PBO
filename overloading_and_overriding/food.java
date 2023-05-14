/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading_and_overriding;

/**
 *
 * @author AURA
 */
public class food {
    public String name;
    public double price;
    
    public food(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public void print() {
        System.out.println(name + " : Rp." + price + "\n");
    }
    
    public void eat() {
        System.out.println("This "+name+" is amazing! \n");
    }

    public double getTotalPrice(double quantity) {
        return price * quantity;
    }

    public double getTotalPrice(double quantity, double discount) {
        double total;
        total = (price * quantity);
        discount = total - ((discount/100) *total);
        return discount;
    }
}
