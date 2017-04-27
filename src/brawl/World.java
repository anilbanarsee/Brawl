/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brawl;

import java.util.ArrayList;

/**
 *
 * @author Reetoo
 */
public class World {
    final int WIDTH,HEIGHT;
    
    ArrayList<Player> players;
    ArrayList<Terrain> terrain;
    
    public World(int w, int h){
        WIDTH = w;
        HEIGHT = h;
        players = new ArrayList<>();
        terrain = new ArrayList<>();
    }
    
    
    public void addTerrain(Terrain terrain){
        
        this.terrain.add(terrain);
     
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
    
    public static void main(String[] args){
    
        
        
    
    }
    
}
