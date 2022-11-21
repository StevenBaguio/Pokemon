/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise06photonbaguiosteven;

/**
 *
 * @author bagui
 */
public class WaterType extends Monster{
    public WaterType(String n, int hp, int base){
        super(n, "Water", "Fire", "Grass", hp, base);
    }
    
    public void rest(){
        this.hp += this.maxHP/2;
    }
    
    @Override
    public void special(){
        this.hp += this.maxHP/5;
    }
}
