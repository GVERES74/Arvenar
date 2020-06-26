/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_Characters;

import pkg_Items.weapons.Weapons;

/**
 *
 * @author VERESG
 */
public class Npc_Monster_Dragon extends Npc_Monster{
    
    public Npc_Monster_Dragon(String fname, String race, String cast, Weapons weapon, String shout, int max_health){
        
  this.fname = fname;
  this.race = race;
  this.cast = cast;
  this.fav_weapon = weapon;
  this.shout = shout;
  this.health_point = max_health;
  this.max_health = max_health;
  this.current_weapon_damage = fav_weapon.weapon_getDamage();    
  this.defend_point = fav_weapon.getMin_damage();
}
   
    public String getFname() {
        return fname;
    }
   
   public String getCast() {
        return cast;
    }

   public int getHealth_point() {
        return health_point;
    }
          
    @Override
    public void attacksOpponent(Character opponent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
