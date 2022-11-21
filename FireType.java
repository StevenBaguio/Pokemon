/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise06photonbaguiosteven;

/**
 *
 * @author bagui
 */
public class FireType extends Monster{
    public FireType(String n, int hp, int base){
        super(n, "Fire", "Grass", "Water", hp, base);
        this.atk = (int) (base*1.3);
        this.def = (int) (base*0.7);
    }
    
    @Override
    public void special(){
        this.atk += 2;
        this.hp -= this.maxHP/10;
    }
}
