/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brawl;

import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;
import java.util.Arrays;

/**
 *
 * @author Reetoo
 */
public class Terrain {
    
    double[][] points;
    
    public Terrain(double[][] points){
        this.points = points;
    }
    
    public Shape getDrawable(){
        
        

        GeneralPath line = new GeneralPath(GeneralPath.WIND_EVEN_ODD, points.length);
        
        line.moveTo(points[0][0], points[0][1]);
        
        for(int i=1; i<points.length; i++){
            line.lineTo(points[i][0],points[i][1]);
            System.out.println(Arrays.toString(points[i]));
        }
        line.closePath();
        return line;
    }
    
}
