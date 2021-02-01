/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eekian
 */
public class ShapeManager {
    
    public static void main(String args[]) {
        Triangle myTri = new Triangle(2,3,"pink"); 
        myTri.show();
        
        Triangle yrTri = new Triangle(4, 5, "blue");
        myTri.compareTo(yrTri);
        
        Object myObj = new Object();
        myTri.compareTo(myObj);
    }
}
