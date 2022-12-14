/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise06photonbaguiosteven;

/**
 *
 * @author bagui
 */
import java.util.ArrayList;

public abstract class Monster implements Interactive {
    private final String name, type, strongAgainst, weakAgainst;
    int maxHP, hp, atk, def; //changed atk and def from private
    private int xp, lvl;
    private static ArrayList<Monster> monsterList = new ArrayList<>();

    public Monster(String n, String t, String s, String w, int m, int base){
        this.name = n;
        this.type = t;
        this.strongAgainst = s;
        this.weakAgainst = w;
        this.maxHP = m;
        this.hp = m;
        this.atk = base;
        this.def = base;
        monsterList.add(this);
    }

    public String getName() {
        return name;
    }
    public String getType(){
        return type;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return hp;
    }
    public int getAtk() {
        return atk;
    }
    public int getDef() {
        return def;
    }
    public static ArrayList<Monster> getMonsterList() {
        return monsterList;
    }

    public void attack(Monster m){
        int damage = (int) ((atk*atk)/(double)(atk+m.getDef()));    // damage is calculated as  double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
            System.out.println(name  + " attacked " + m.getName() +
            " and dealt " + damage + " damage, reducing it to " + m.getHP() + "HP.");
        if(strong) System.out.println("It was super effective!");
        if(weak) System.out.println("It wasn't very effective...");

        if(m.hp <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.");
        }
    }

    public abstract void special();

    public void restoreHealth(){
        hp = maxHP;
    }
    
    public void interact(Trainer n){
        System.out.println(n.getName() + " interacted with " + this.getName());
        System.out.println("Name: " + this.getName() + "\nType: " + this.getType() );
    }

}