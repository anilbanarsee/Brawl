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
    
    public Force(double force, double[] vector){
        this.force = force;
        this.vector = vector;
    }

    public double getForce() {
        return force;
    }

    public double[] getVector() {
        return vector;
    }

}
