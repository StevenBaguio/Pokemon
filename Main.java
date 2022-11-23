/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise06photonbaguiosteven;

/**
 *
 * @author bagui
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trainer T = new Trainer("Steven");
        Monster F = new FireType("Charmander", 100, 5) {};
        NPC N = new NPC("Breon");
        Location L = new Location("Monstadt", "Sweet Madame");
        
        T.inspect(F);
        T.inspect(N);
        T.inspect(L);
    }
    
    
}
