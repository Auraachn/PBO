/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasdiagram;
public class rectangle{
    public double width;
    public double lenght;
    public double calculated_area_of_rectangle(){
        double area_rectangle;
        area_rectangle = width * lenght;
        return area_rectangle;
    }
    public double calculated_perimeter_of_rectangle(){
        double perimeter_rectangle;
        perimeter_rectangle = (this.lenght *2) + (this.width*2);
        return perimeter_rectangle;
    }}
