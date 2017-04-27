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
public class Brawl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        World w = new World(500,500);
        
        double[][] terrainData = {{50,400},{450,400},{350,200},{150,200}};
        Terrain terrain = new Terrain(terrainData);
        
        w.addTerrain(terrain);
        WorldView wv = new WorldView(w,0,0,500,500);
        MainFrame mf = new MainFrame(wv);
        
    }
    
}
