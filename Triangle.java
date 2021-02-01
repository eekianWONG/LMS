/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eekian
 */
public class Triangle extends Shape implements Comparable{
    
    private int base, height;

    public Triangle(int base, int height, String colour) {
        this.base = base;
        this.height = height;
    }
    
    public void show() {
        System.out.println("I am a Triangle");    
    }
    
    public double getArea() {
        return 0;
    }

    public int compareTo(Object o) {
        
        if (o == null) throw new NullPointerException();
        
        if (!(o instanceof Triangle)) throw new ClassCastException("Not a Triangle");
        
        /*
        if (o != null) {
            if (o instanceof Triangle) {
                ((Triangle)o).getArea();
            }
        }
        */
        
        /*try {
            this.getArea();
            ((Triangle)o).getArea();
        } catch (NullPointerException npe) {
            
        } catch (ClassCastException cce) {
            
        } */
        return 0;
    }
    
}
