/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brawl;

/**
 *
 * @author Anil James Banarsee
 */
public class MathUtils {
    
    public static double[] normalizeVector(double vx, double vy){
        
        double length = Math.sqrt((vx*vx)+(vy*vy));
        double factor = 1/length;
        double[] vec = {vx*(factor),vy*(factor)};
        return vec;
        
    }
    public static double getDeterminant(double[][] d){
        
        return (d[0][0]*d[1][1]) - (d[0][1]*d[1][0]);
        
    }
    
}
