/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brawl;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Reetoo
 */
public class World {
    final int WIDTH,HEIGHT;
    
    ArrayList<Player> players;
    ArrayList<Terrain> terrain;
    
    public final double DEFAULT_GRAVITY = 1;
    
    public double gravity;
    
    public World(int w, int h){
        WIDTH = w;
        HEIGHT = h;
        players = new ArrayList<>();
        terrain = new ArrayList<>();
        gravity = DEFAULT_GRAVITY;
    }
    
    
    public void addTerrain(Terrain terrain){
        
        this.terrain.add(terrain);
     
    }
    public void addPlayer(Player player){
        this.players.add(player);
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Terrain> getTerrain() {
        return terrain;
    }
    
    public void tick(){
        
        for(Player p: players){
            p.clearForces();
            double[] vec = {0,1};
            p.addForce(new Force(p.mass*this.gravity, vec));
            
            
            Force f = p.getResultantForce();
            double xAcc = f.getXComponent()/p.mass;
            double yAcc = f.getYComponent()/p.mass;
           
            p.vx+=xAcc;
            p.vy+=yAcc;

        }
        for(Player p: players){
            
            double[] moveVector = {p.vx, p.vy};
            ArrayList<double[]> impactPoints = new ArrayList<>();
            for(Terrain t: terrain){
                
               // impactPoints.addAll(t.getImpactPoints(moveVector, p.x, p.y));
                
            }
        }
        
 
        
    }
    
    public static void main(String[] args){
    
        
        
    
    }
    
}
