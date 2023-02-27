/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasdiagram;

public class Circle {
    double phi=3.14;
    public double r;
    public double calculated_area_of_circle(){
        double area_circle;
        area_circle = phi * this.r * this.r;
        return area_circle;
    }
    public double calculated_perimeter_of_circle(){
        double perimeter_circle;
        perimeter_circle = 2 * phi * this.r;
        return perimeter_circle;
    }
}
