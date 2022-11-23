/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise06photonbaguiosteven;

/**
 *
 * @author bagui
 */


public class NPC extends Character implements Interactive {
    private String dialog;
    
    public String getDialog(){
        return dialog;
    }
    public NPC(String n){
        super(n);
        this.dialog = "Hello, my name is " + n + ".";
    }
    public NPC(String n, Location l){
        super(n, l);
        this.dialog = "Hello, my name is " + n + ".";
    }
    public NPC(String n, String d){
        super(n);
        this.dialog = d;
    }
    public NPC(String n, Location l, String d){
        super(n, l);
        this.dialog = d;
    }

    @Override
    public void interact(Trainer n) {
        System.out.println(n.getName() + " interacted with " + this.getName());
        System.out.println(getDialog());
    }
    

}
