/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brawl;

/**
 *
 * @author Reetoo
 */
public class SquareTerrain{
    
    private double width;
    private double height;
    private double x;
    private double y;

    public SquareTerrain(double x, double y, double w, double h){
        width = w;
        height = h;
        this.x = x;
        this.y = y;
    }
    
    
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    
    
}
