/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise06photonbaguiosteven;

/**
 *
 * @author bagui
 */

public class Exercise06photonbaguiosteven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monster F = new FireType("Charmander", 100, 5);
        Monster W = new WaterType("Vaporeon", 50, 10);
        Monster G = new GrassType("Leafeon", 75, 7);
    

        while(G.getHP() > 0 && W.getHP() > 0){
            G.attack(F);
            F.attack(G);
        }
        
        G.restoreHealth();
        F.restoreHealth();
        
        while(F.getHP() > 0 && W.getHP() > 0){
            F.attack(W);
            W.attack(F);
        }
        
        F.restoreHealth();
        W.restoreHealth();
        
        while(W.getHP() > 0 && G.getHP() > 0){
            W.attack(G);
            G.attack(W);
        }
    
        W.restoreHealth();
        G.restoreHealth();
    }
    
    
}
