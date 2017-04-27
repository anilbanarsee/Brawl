/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brawl;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Reetoo
 */
public class WorldView extends JPanel{
    
    double vpWidth, vpHeight;
    World world;
    double xPos, yPos;
    
    public WorldView(World world, double xPos, double yPos, double vpWidth, double vpHeight){
        this.vpWidth = vpWidth;
        this.vpHeight = vpHeight;
        this.xPos = xPos;
        this.yPos = yPos;
        this.world = world;
    }
    
    @Override
    public void paintComponent(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g;
        
        ArrayList<Terrain> terrain = world.getTerrain();
        
        for(Terrain t: terrain){
            Shape shape = t.getDrawable();
            g2d.fill(shape);
        }
        
    }
    
}
