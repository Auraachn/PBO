/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasdiagram;

public class Oval {
    double phi=3.14;
    public double semi_major;
    public double semi_minor;
    public double calculated_area_of_oval(){
        double area_oval;
        area_oval = phi * this.semi_major * this.semi_minor;
        return area_oval;
    }
    public double calculated_perimeter_of_oval(){
        double perimeter_oval;
        double a = Math.sqrt(((this.semi_major*this.semi_major)+(this.semi_minor*this.semi_minor))/2);
        perimeter_oval = 2 * phi *a;
        return perimeter_oval;
}
}