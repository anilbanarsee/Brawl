/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brawl;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Reetoo
 */
public class Player {
    
    public double x, y;
    public double vx, vy;
    
    public double mass;
    
    public Force resultant;
    boolean resultantOutdated;
    
    protected ArrayList<Force> forces;

    public ArrayList<Force> getForces() {
        return forces;
    }
    public void clearForces(){
        forces.clear();
    }
    public void addForce(Force f){
        forces.add(f);
    }
    public Force getResultantForce(){
        
        double vecx = 0;
        double vecy = 0;
        
        for(Force f: this.forces){

            vecx += f.getXComponent();
            vecy += f.getYComponent();
        }
        
        double[] vec = {vecx, vecy};
        
        return new Force(vec);
        
        
    }
    public Shape getDrawable(){
         Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 20, 20);
         return circle;
    }
    public Player(double x, double y){
        this.x = x;
        this.y = y;
        mass = 5;
        forces = new ArrayList<>();
    }
    
}
