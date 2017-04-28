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
public class Force {
    
    double force;
    double[] vector;
    
    double x, y;
    double factor;
    boolean knowFactor;
    boolean xC, yC;
    
    public Force(double[] vector){
        x = vector[0];
        xC = true;
        y = vector[1];
        yC = true;
        this.force = Math.sqrt((vector[0]*vector[0])+(vector[1])*(vector[1]));
        if(this.force!=1)
            this.vector = MathUtils.normalizeVector(vector[0], vector[1]);
    }
    public Force(double force, double[] vector){
        this.force = force;
        this.vector = MathUtils.normalizeVector(vector[0], vector[1]);
        xC = false;
        yC = false;
    }

    public double getForce() {
        return force;
    }

    public double[] getVector() {
        return vector;
    }
    public double getXComponent(){
        if(xC)
            return x;

        if(!knowFactor){
            this.factor = force/Math.sqrt((vector[0]*vector[0])+(vector[1]*vector[1]));
            knowFactor = true;
        }
     


        
        x = this.factor*vector[0];
        xC = true;
        return x;
        
    }
    public double getYComponent(){
        if(yC)
            return y;

        if(!knowFactor){
            this.factor = force/Math.sqrt((vector[0]*vector[0])+(vector[1]*vector[1]));
            knowFactor = true;
        }
     


        
        y = this.factor*vector[1];
        yC = true;
        return y;
        
    }
}
