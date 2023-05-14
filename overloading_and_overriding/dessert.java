/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading_and_overriding;

/**
 *
 * @author AURA
 */
public class dessert extends food {
    public dessert(String name, double price) {
        super(name, price);
    }
    @Override
    public void eat() {
        System.out.println("This dessert is amazing!\n");
    }
    
    public String temperature(int a){
        return "This " + this.name + "'s temperature is " + a +" degree celsiun\n";
    }
    
    public String temperature(String a){
        return "This " + this.name + " have a " + a +" feel for it\n";
}
}
    
