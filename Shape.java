/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eekian
 */
public abstract class Shape {
    
    private String colour = "red";
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public String getColour() {
        return this.colour;
    }
    
    public abstract void show();
    
    public abstract double getArea();
    
}
